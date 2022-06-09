
package br.edu.ifpr.paranavai.pacotes.biblioteca;

import java.util.Date;

public class Reserva {
    private Date DataHoraDevolucao;
    private Date DataHoraEntrega;

    public Reserva() {
    }

    public Reserva(Date DataHoraDevolucao, Date DataHoraEntrega) {
        this.DataHoraDevolucao = DataHoraDevolucao;
        this.DataHoraEntrega = DataHoraEntrega;
    }

    public Date getDataHoraDevolucao() {
        return this.DataHoraDevolucao;
    }

    public void setDataHoraDevolucao(Date DataHoraDevolucao) {
        this.DataHoraDevolucao = DataHoraDevolucao;
    }

    public Date getDataHoraEntrega() {
        return this.DataHoraEntrega;
    }

    public void setDataHoraEntrega(Date DataHoraEntrega) {
        this.DataHoraEntrega = DataHoraEntrega;
    }
    
    
}
