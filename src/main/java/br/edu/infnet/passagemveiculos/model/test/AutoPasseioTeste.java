package br.edu.infnet.passagemveiculos.model.test;

import br.edu.infnet.passagemveiculos.model.domain.veiculos.AutoPasseio;
import br.edu.infnet.passagemveiculos.model.domain.veiculos.CategoriaEnum;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AutoPasseioTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println();
        System.out.println("..:: Runner AutoPasseio ::..");

        AutoPasseio autoPasseio1 = new AutoPasseio();
        autoPasseio1.setPlaca("AUT-0001");
        autoPasseio1.setFabricante("Volkswagen");
        autoPasseio1.setModelo("T-Cross");
        autoPasseio1.setMotor("250 TSI");
        autoPasseio1.setCategoria(CategoriaEnum.SUV);
        autoPasseio1.setAno(2021L);
        System.out.println(">>> " + autoPasseio1);

        AutoPasseio autoPasseio2 = new AutoPasseio();
        autoPasseio2.setPlaca("AUT-0002");
        autoPasseio2.setFabricante("Volkswagen");
        autoPasseio2.setModelo("Gol Confortline");
        autoPasseio2.setMotor("1.0");
        autoPasseio2.setCategoria(CategoriaEnum.PASSEIO);
        autoPasseio2.setAno(2022L);
        System.out.println(">>> " + autoPasseio2);

        AutoPasseio autoPasseio3 = new AutoPasseio();
        autoPasseio3.setPlaca("AUT-0003");
        autoPasseio3.setFabricante("Volkswagen");
        autoPasseio3.setModelo("Amarok Highline");
        autoPasseio3.setMotor("3.0 Turbo");
        autoPasseio3.setCategoria(CategoriaEnum.PICKUP);
        autoPasseio3.setAno(2023L);
        System.out.println(">>> " + autoPasseio3);

        System.out.println();
    }
}
