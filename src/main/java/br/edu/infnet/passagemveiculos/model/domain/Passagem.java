package br.edu.infnet.passagemveiculos.model.domain;

import java.time.LocalDateTime;

public class Passagem {

    private String praca;
    private String guiche;
    private String operador;
    private LocalDateTime dataHora;
    private Cliente cliente;

    public Passagem() {
        this.dataHora = LocalDateTime.now();
    }

    public Passagem(Cliente cliente) {
        this();
        this.cliente = cliente;
    }

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Passagem[" +
                "praca='" + praca +
                ", guiche='" + guiche +
                ", operador='" + operador +
                ", dataHora=" + dataHora +
                ", cliente=" + cliente +
                ']';
    }
}
