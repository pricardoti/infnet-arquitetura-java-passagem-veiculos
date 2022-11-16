package br.edu.infnet.passagemveiculos.model.domain.veiculos;

import javax.persistence.Entity;

@Entity
public class Transporte extends Veiculo {

    private Long quantidadePassageiros;

    public Long getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(Long quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    @Override
    public String toString() {
        return "Transporte["
                + super.toString()
                + ", quantidadePassageiros=" + quantidadePassageiros
                + "]";
    }
}
