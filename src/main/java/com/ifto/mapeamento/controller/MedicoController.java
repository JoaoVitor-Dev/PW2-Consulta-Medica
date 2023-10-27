package com.ifto.mapeamento.controller;

import com.ifto.mapeamento.model.entity.Medico;
import com.ifto.mapeamento.model.entity.Paciente;
import com.ifto.mapeamento.model.repository.MedicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Transactional
@Controller
@RequestMapping("medico")
public class MedicoController {
    @Autowired
    MedicoRepository repository;

    @GetMapping("/form")
    public String form(Medico medico){
        return "/medico/form";
    }


    @GetMapping("/list")
    public ModelAndView listarMedico(ModelMap model) {
        model.addAttribute("medico", repository.medicos());
        return new ModelAndView("medico/list", model);
    }

    @GetMapping("/{id}")
    public ModelAndView listarMedico(@PathVariable("id") Long id, ModelMap model) {
        model.addAttribute("medico", repository.medico(id));
        return new ModelAndView("medico/consulta", model);
    }

    @PostMapping("/save")
    public ModelAndView salvarMedico(@Valid Medico medico, BindingResult result){

        if (result.hasErrors())
            return new ModelAndView("medico/form");

        repository.save(medico);
        return new ModelAndView("redirect:/medico/list");
    }

    @GetMapping("/removeMedico/{id}")
    public ModelAndView remove(@PathVariable("id") Long id){
        repository.remove(id);
        return new ModelAndView("redirect:/medico/list");
    }

    @GetMapping("/editMedico/{id}")
    public ModelAndView editMedico(@PathVariable("id") Long id, ModelMap model) {
        model.addAttribute("medico", repository.medico(id));
        return new ModelAndView("/medico/form", model);
    }

    @PostMapping("/update")
    public ModelAndView updateMedico(@Valid Medico medico, BindingResult result) {

        if (result.hasErrors())
            return new ModelAndView("medico/form");

        repository.update(medico);
        return new ModelAndView("redirect:/medico/list");
    }
}
