package br.edu.infnet.passagemveiculos.runners;

import br.edu.infnet.passagemveiculos.model.domain.veiculos.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class VeiculoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println();
        System.out.println("..:: Runner Veiculos ::..");

        AutoPasseio autoPasseio = new AutoPasseio();
        autoPasseio.setPlaca("AAA-0001");
        autoPasseio.setFabricante("Volkswagen");
        autoPasseio.setModelo("T-Cross");
        autoPasseio.setMotor("1.4");
        autoPasseio.setCategoria(CategoriaEnum.SUV);
        autoPasseio.setAno(2021L);
        System.out.println(">>> " + autoPasseio);

        Carga caminhao = new Carga();
        caminhao.setPlaca("AAA-0002");
        caminhao.setFabricante("Volvo");
        caminhao.setModelo("FH 540");
        caminhao.setMotor("12.8");
        caminhao.setCarroceria(CarroceriaEnum.PRANCHA);
        caminhao.setAno(2022L);
        System.out.println(">>> " + caminhao);

        Transporte onibus = new Transporte();
        onibus.setPlaca("AAA-0003");
        onibus.setFabricante("Scania");
        onibus.setModelo("Euro 6 K280 4x2");
        onibus.setMotor("13.0");
        onibus.setQuantidadePassageiros(115L);
        onibus.setAno(2022L);
        System.out.println(">>> " + onibus);

        System.out.println();
    }
}
