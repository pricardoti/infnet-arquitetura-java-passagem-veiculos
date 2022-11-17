package br.edu.infnet.passagemveiculos.model.domain.veiculos;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Passeio extends Veiculo {

    @Enumerated(EnumType.ORDINAL)
    private CategoriaEnum categoria;

    public CategoriaEnum getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEnum categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Passeio["
                + super.toString()
                + ", categoria=" + categoria
                + "]";
    }
}
