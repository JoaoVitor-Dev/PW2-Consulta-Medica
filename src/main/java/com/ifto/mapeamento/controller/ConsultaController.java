package com.ifto.mapeamento.controller;

import com.ifto.mapeamento.model.entity.Consulta;
import com.ifto.mapeamento.model.entity.Medico;
import com.ifto.mapeamento.model.entity.Paciente;
import com.ifto.mapeamento.model.repository.ConsultaRepository;
import com.ifto.mapeamento.model.repository.MedicoRepository;
import com.ifto.mapeamento.model.repository.PacienteRepository;
import com.ifto.mapeamento.model.validation.groups.Insert;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Transactional
@Controller
@RequestMapping("consulta")
public class ConsultaController {
    @Autowired
    ConsultaRepository repository;

    @Autowired
    PacienteRepository pacienteRepository;

    @Autowired
    MedicoRepository medicoRepository;
    
    @ResponseBody
    @GetMapping("/list")
    public ModelAndView listarConsultas(ModelMap model) {
        model.addAttribute("consulta", repository.consultas());
        model.addAttribute("vTotal", repository.vTotal());
        return new ModelAndView("consulta/list", model);
    }

    @GetMapping("/form")
    public ModelAndView formConsulta(ModelMap model){
        model.addAttribute("paciente",pacienteRepository.pacientes());
        model.addAttribute("medico", medicoRepository.medicos());
        model.addAttribute("consulta", new Consulta());
        return new ModelAndView("consulta/form", model);
    }

    @GetMapping("/{id}")
    public ModelAndView listarConsulta(@PathVariable("id") Long id, ModelMap model) {
        model.addAttribute("consulta", repository.consulta(id));
        return new ModelAndView("consulta/detalhe", model);
    }

    @PostMapping("/save")
    public ModelAndView saveConsulta(@Validated(Insert.class)Consulta consulta, BindingResult result, ModelMap model){

        if (result.hasErrors()) {
            model.addAttribute("paciente", pacienteRepository.pacientes());
            model.addAttribute("medico", medicoRepository.medicos());
            return new ModelAndView("/consulta/form", model);

        }
        repository.save(consulta);
        return new ModelAndView("redirect:/consulta/list");
    }

    @GetMapping("/editConsulta/{id}")
    public ModelAndView editMedico(@PathVariable("id") Long id, ModelMap model) {
        model.addAttribute("consulta", repository.consulta(id));
        List<Medico> medicos = medicoRepository.medicos();
        List<Paciente> pacientes = pacienteRepository.pacientes();
        model.addAttribute("medico", medicos);
        model.addAttribute("paciente", pacientes);
        return new ModelAndView("/consulta/form", model);
    }

    @GetMapping("/removeConsulta/{id}")
    public ModelAndView remove(@PathVariable("id") Long id){
        repository.remove(id);
        return new ModelAndView("redirect:/consulta/list");
    }

    @PostMapping("/update")
    public ModelAndView updateConsulta(Consulta consulta) {
        repository.update(consulta);
        return new ModelAndView("redirect:/consulta/list");
    }
}
