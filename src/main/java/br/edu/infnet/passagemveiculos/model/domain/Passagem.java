package br.edu.infnet.passagemveiculos.model.domain;

import br.edu.infnet.passagemveiculos.model.domain.veiculos.Veiculo;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Passagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String praca;
    private String guiche;
    private String operador;
    private LocalDateTime dataHora;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.DETACH)
    private List<Veiculo> veiculos;

    public Passagem() {
        this.dataHora = LocalDateTime.now();
    }

    public Passagem(Cliente cliente) {
        this();
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    @Override
    public String toString() {
        return "Passagem[" +
                "id='" + id +
                "praca='" + praca +
                ", guiche='" + guiche +
                ", operador='" + operador +
                ", dataHora=" + dataHora +
                ", cliente=" + cliente +
                ", veiculos=" + veiculos.size() +
                ']';
    }
}
