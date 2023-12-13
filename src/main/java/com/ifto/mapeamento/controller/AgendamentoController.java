package com.ifto.mapeamento.controller;


import com.ifto.mapeamento.model.entity.Agendamento;
import com.ifto.mapeamento.model.entity.Medico;
import com.ifto.mapeamento.model.repository.AgendaRepository;
import com.ifto.mapeamento.model.repository.AgendamentoRepository;
import com.ifto.mapeamento.model.repository.MedicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Transactional
@Controller
@RequestMapping("agendamento")
public class AgendamentoController {
    private AgendamentoRepository agendamentoRepository;
    private AgendaRepository agendaRepository;
    private  MedicoRepository medicoRepository;

    @GetMapping("/form")
    public ModelAndView formAgendamento(@PathVariable(value = "idMedico", required = false) Long idMedico, ModelMap model, Medico medico, Agendamento agendamento){
        medico = medicoRepository.medico(idMedico);
        var agenda = agendaRepository.agendasPorMedico(idMedico);
        model.addAttribute("agenda", agenda);
        model.addAttribute("medico", medico);
        return new ModelAndView("agendamento/form", model);
    }

    @GetMapping("/list")
    public String listar(ModelMap model) {
        List<Agendamento> agendamentos = agendamentoRepository.agendamentos();

        model.addAttribute("agendamento", agendamentos);

        return "agendamento/list";
    }

}
