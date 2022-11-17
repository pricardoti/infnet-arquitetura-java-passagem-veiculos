package br.edu.infnet.passagemveiculos.model.domain;

import br.edu.infnet.passagemveiculos.model.domain.veiculos.Veiculo;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Passagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String praca;
    private Integer guiche;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime dataHora;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH, optional = false)
    @JoinColumn(name = "idVeiculo")
    private Veiculo veiculo;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

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

    public Integer getGuiche() {
        return guiche;
    }

    public void setGuiche(Integer guiche) {
        this.guiche = guiche;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Passagem[" +
                "id='" + id +
                "praca='" + praca +
                ", guiche='" + guiche +
                ", dataHora=" + dataHora +
                ", cliente=" + cliente +
                ", veiculos=" + veiculo +
                ']';
    }
}
