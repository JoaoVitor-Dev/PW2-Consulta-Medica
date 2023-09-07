package com.ifto.mapeamento.controller;

import com.ifto.mapeamento.model.entity.Consulta;
import com.ifto.mapeamento.model.entity.Medico;
import com.ifto.mapeamento.model.repository.ConsultaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Transactional
@Controller
@RequestMapping("consulta")
public class ConsultaController {
    @Autowired
    ConsultaRepository repository;

    @GetMapping("/list")
    public ModelAndView listarConsultas(ModelMap model) {
        model.addAttribute("consulta", repository.consultas());
        return new ModelAndView("consulta/list", model);
    }

    @GetMapping("/{id}")
    public ModelAndView listarConsulta(@PathVariable("id") Long id, ModelMap model) {
        model.addAttribute("consulta", repository.consulta(id));
        return new ModelAndView("consulta/detalhe", model);
    }
}
