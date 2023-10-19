package com.ifto.mapeamento.controller;

import com.ifto.mapeamento.model.entity.Paciente;
import com.ifto.mapeamento.model.repository.PacienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.management.Attribute;

@Transactional
@Controller
@RequestMapping("paciente")
public class PacienteController {
    @Autowired
    PacienteRepository repository;

    @GetMapping("/form")
    public String form(Paciente paciente){
        return "/paciente/form";
    }

    @GetMapping("/list")
    public ModelAndView listarPaciente(ModelMap model) {
        model.addAttribute("paciente", repository.pacientes());
        return new ModelAndView("paciente/list", model);
    }

    @GetMapping("/{id}")
    public ModelAndView listarPaciente(@PathVariable("id") Long id, ModelMap model) {
        model.addAttribute("paciente", repository.paciente(id));
        return new ModelAndView("paciente/consulta", model);
    }

    @PostMapping("/save")
    public ModelAndView salvarPaciente(Paciente paciente, ModelMap model, RedirectAttributes attributes){
        repository.save(paciente);
        attributes.addFlashAttribute("mensagem", "Paciente cadastrado com sucesso!");
        return new ModelAndView("redirect:/paciente/list");
    }

    @GetMapping("/removePaciente/{id}")
    public ModelAndView remove(@PathVariable("id") Long id, RedirectAttributes attributes, ModelMap model){

        if(!repository.paciente(id).getConsultas().isEmpty()){
            attributes.addFlashAttribute("mensagem", "Não é possível deletar paciente que possuí consultas!");
            return new ModelAndView("redirect:/paciente/list");
        }

        repository.remove(id);
        return new ModelAndView("redirect:/paciente/list");
    }

    @GetMapping("/editPaciente/{id}")
    public ModelAndView editPaciente(@PathVariable("id") Long id, ModelMap model) {
        model.addAttribute("paciente", repository.paciente(id));
        return new ModelAndView("/paciente/form", model);
    }

    @PostMapping("/update")
    public ModelAndView updatePaciente(Paciente paciente) {
        repository.update(paciente);
        return new ModelAndView("redirect:/paciente/list");
    }
}
