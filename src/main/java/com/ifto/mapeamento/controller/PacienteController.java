package com.ifto.mapeamento.controller;

import com.ifto.mapeamento.model.repository.MedicoRepository;
import com.ifto.mapeamento.model.repository.PacienteRepository;
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
@RequestMapping("paciente")
public class PacienteController {
    @Autowired
    PacienteRepository repository;

    @GetMapping("/list")
    public ModelAndView listarPaciente(ModelMap model) {
        model.addAttribute("paciente", repository.pacientes());
        return new ModelAndView("paciente/list", model);
    }

    @GetMapping("/{id}")
    public ModelAndView listarMedico(@PathVariable("id") Long id, ModelMap model) {
        model.addAttribute("paciente", repository.paciente(id));
        return new ModelAndView("paciente/consulta", model);
    }
}
