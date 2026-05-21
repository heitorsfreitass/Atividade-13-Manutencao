package br.edu.refactoring.estacionamento;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Classe criada para manipulação do LocalDateTime
public class DataHoraEstacionamento {

    private LocalDateTime dataHora;

    public DataHoraEstacionamento(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String formatar() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return dataHora.format(formatter);
    }

    public boolean isHorarioEspecial() {
        return dataHora.getDayOfWeek() == DayOfWeek.SATURDAY
                || dataHora.getDayOfWeek() == DayOfWeek.SUNDAY
                || dataHora.getHour() < 7
                || dataHora.getHour() >= 22;
    }

    public LocalDateTime toLocalDateTime() {
        return dataHora;
    }
}