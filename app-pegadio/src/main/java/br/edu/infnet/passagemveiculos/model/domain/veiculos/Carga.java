package br.edu.infnet.passagemveiculos.model.domain.veiculos;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Carga extends Veiculo {

    @Enumerated(EnumType.ORDINAL)
    private CarroceriaEnum carroceria;

    public CarroceriaEnum getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(CarroceriaEnum carroceria) {
        this.carroceria = carroceria;
    }

    @Override
    public String toString() {
        return "Carga["
                + super.toString()
                + ", carroceria=" + carroceria
                + "]";
    }
}
