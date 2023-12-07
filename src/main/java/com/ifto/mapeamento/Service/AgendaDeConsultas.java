package com.ifto.mapeamento.Service;
import com.ifto.mapeamento.model.entity.DadosAgendamentoConsulta;
import com.ifto.mapeamento.model.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AgendaDeConsultas {
    @Autowired
    private ConsultaRepository consultaRepository;

    public void agendar(DadosAgendamentoConsulta dados){

    }
}
