package com.ifto.mapeamento.controller;

import com.ifto.mapeamento.model.repository.MedicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Transactional
@Controller
@RequestMapping("medico")
public class MedicoController {
    @Autowired
    MedicoRepository repository;

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


}
