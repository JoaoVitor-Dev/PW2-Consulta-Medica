package com.ifto.mapeamento.model.entity;

import jakarta.validation.constraints.Future;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DadosAgendamentoConsulta {

    Long idMedico;
    Long idPaciente;
    @Future //anotação para que seja passado uma data futura.
    LocalDateTime data;

}
