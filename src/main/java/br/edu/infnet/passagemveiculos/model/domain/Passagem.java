package br.edu.infnet.passagemveiculos.model.domain;

import java.time.LocalDateTime;

public class Passagem {

    private String praca;
    private String guiche;
    private String operador;
    private LocalDateTime dataHora;

    public String getPraca() {
        return praca;
    }

    public void setPraca(String praca) {
        this.praca = praca;
    }

    public String getGuiche() {
        return guiche;
    }

    public void setGuiche(String guiche) {
        this.guiche = guiche;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Passagem[" +
                "praca='" + praca +
                ", guiche='" + guiche +
                ", operador='" + operador +
                ", dataHora=" + dataHora +
                ']';
    }
}
