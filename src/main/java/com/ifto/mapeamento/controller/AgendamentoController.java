package com.ifto.mapeamento.controller;


import com.ifto.mapeamento.model.entity.Agendamento;
import com.ifto.mapeamento.model.entity.Consulta;
import com.ifto.mapeamento.model.entity.Medico;
import com.ifto.mapeamento.model.repository.AgendaRepository;
import com.ifto.mapeamento.model.repository.AgendamentoRepository;
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
@RequestMapping("agendamento")
public class AgendamentoController {
    @Autowired
    private AgendamentoRepository agendamentoRepository;
    @Autowired
    private AgendaRepository agendaRepository;
    @Autowired
    private MedicoRepository medicoRepository;

    @GetMapping("/{idMedico}")
    public String formAgendamento(@PathVariable(value = "idMedico", required = false) Long idMedico, ModelMap model, Medico medico, Agendamento agendamento){
        medico = medicoRepository.medico(idMedico);
        var agenda = agendaRepository.agendasPorMedico(idMedico);
        model.addAttribute("agenda", agenda);
        model.addAttribute("medico", medico);

        return "agendamento/form";
    }

    @GetMapping("/list")
    public ModelAndView listar(ModelMap model) {
        model.addAttribute("agendamento", agendamentoRepository.agendamentos());
        return new ModelAndView("agendamento/list", model);
    }

}
