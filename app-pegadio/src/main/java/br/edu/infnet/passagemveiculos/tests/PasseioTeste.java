package br.edu.infnet.passagemveiculos.tests;

import br.edu.infnet.passagemveiculos.model.domain.veiculos.CategoriaEnum;
import br.edu.infnet.passagemveiculos.model.domain.veiculos.Passeio;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PasseioTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println();
        System.out.println("..:: Runner Veiculo de Passeio ::..");

        Passeio passeio1 = new Passeio();
        passeio1.setPlaca("AUT-0001");
        passeio1.setFabricante("Volkswagen");
        passeio1.setModelo("T-Cross");
        passeio1.setMotor("250 TSI");
        passeio1.setCategoria(CategoriaEnum.SUV);
        passeio1.setAno(2021L);
        System.out.println(">>> " + passeio1);

        Passeio passeio2 = new Passeio();
        passeio2.setPlaca("AUT-0002");
        passeio2.setFabricante("Volkswagen");
        passeio2.setModelo("Gol Confortline");
        passeio2.setMotor("1.0");
        passeio2.setCategoria(CategoriaEnum.HATCH);
        passeio2.setAno(2022L);
        System.out.println(">>> " + passeio2);

        Passeio passeio3 = new Passeio();
        passeio3.setPlaca("AUT-0003");
        passeio3.setFabricante("Volkswagen");
        passeio3.setModelo("Amarok Highline");
        passeio3.setMotor("3.0 Turbo");
        passeio3.setCategoria(CategoriaEnum.PICKUP);
        passeio3.setAno(2023L);
        System.out.println(">>> " + passeio3);

        System.out.println();
    }
}
