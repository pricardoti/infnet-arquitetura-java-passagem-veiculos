package br.edu.infnet.passagemveiculos.model.domain.veiculos;

public abstract class Veiculo {

    private String placa;
    private String fabricante;
    private String modelo;
    private String motor;
    private Long ano;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Long getAno() {
        return ano;
    }

    public void setAno(Long ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "placa=" + placa +
                ", fabricante=" + fabricante +
                ", modelo=" + modelo +
                ", motor=" + motor +
                ", ano=" + ano;
    }
}
