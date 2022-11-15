package br.edu.infnet.passagemveiculos.model.domain.veiculos;

public class Passeio extends Veiculo {

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
