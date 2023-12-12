package com.ifto.mapeamento.controller;


import jakarta.transaction.Transactional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Transactional
@Controller
@RequestMapping("agendamento")
public class AgendamentoController {

    @GetMapping("/form")
    public ModelAndView formAgendamento(ModelMap model){
        return new ModelAndView("agendamento/form", model);
    }


}
