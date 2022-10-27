package br.edu.infnet.passagemveiculos.model.domain.veiculos;

public class Carga extends Veiculo {

    private CarroceriaEnum carroceria;

    public CarroceriaEnum getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(CarroceriaEnum carroceria) {
        this.carroceria = carroceria;
    }

    @Override
    public String toString() {
        return "AutoPasseio["
                + super.toString()
                + "carroceria='" + carroceria
                + "]";
    }
}
