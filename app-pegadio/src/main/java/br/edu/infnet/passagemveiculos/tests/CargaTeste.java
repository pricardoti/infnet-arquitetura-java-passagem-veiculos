package br.edu.infnet.passagemveiculos.tests;

import br.edu.infnet.passagemveiculos.model.domain.veiculos.Carga;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import static br.edu.infnet.passagemveiculos.model.domain.veiculos.CarroceriaEnum.*;

@Component
public class CargaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println();
        System.out.println("..:: Runner Veiculo de Carga ::..");

        Carga caminhao1 = new Carga();
        caminhao1.setPlaca("AAA-1111");
        caminhao1.setFabricante("Volvo");
        caminhao1.setModelo("FH 540");
        caminhao1.setMotor("12.8");
        caminhao1.setCarroceria(PRANCHA);
        caminhao1.setAno(2022L);
        System.out.println(">>> " + caminhao1);

        Carga caminhao2 = new Carga();
        caminhao2.setPlaca("AAA-2222");
        caminhao2.setFabricante("Volvo");
        caminhao2.setModelo("FH 540");
        caminhao2.setMotor("12.8");
        caminhao2.setCarroceria(GRANELEIRA);
        caminhao2.setAno(2022L);
        System.out.println(">>> " + caminhao2);

        Carga caminhao3 = new Carga();
        caminhao3.setPlaca("AAA-3333");
        caminhao3.setFabricante("Volvo");
        caminhao3.setModelo("FH 540");
        caminhao3.setMotor("12.8");
        caminhao3.setCarroceria(BAU);
        caminhao3.setAno(2022L);
        System.out.println(">>> " + caminhao3);

        System.out.println();
    }
}
