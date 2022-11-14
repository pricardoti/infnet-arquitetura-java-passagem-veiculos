package br.edu.infnet.passagemveiculos.model.test;

import br.edu.infnet.passagemveiculos.model.domain.veiculos.Transporte;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TransporteTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println();
        System.out.println("..:: Runner Transporte ::..");

        Transporte onibus1 = new Transporte();
        onibus1.setPlaca("TTT-0001");
        onibus1.setFabricante("Scania");
        onibus1.setModelo("Euro 6 K280 4x2");
        onibus1.setMotor("13.0");
        onibus1.setQuantidadePassageiros(115L);
        onibus1.setAno(2022L);
        System.out.println(">>> " + onibus1);

        Transporte van = new Transporte();
        van.setPlaca("TTT-0002");
        van.setFabricante("Mercedes");
        van.setModelo("Sprinter Van 415");
        van.setMotor("2.2");
        van.setQuantidadePassageiros(10L);
        van.setAno(2023L);
        System.out.println(">>> " + van);

        Transporte microOnibus = new Transporte();
        microOnibus.setPlaca("TTT-0003");
        microOnibus.setFabricante("Mercedes");
        microOnibus.setModelo("LO 916");
        microOnibus.setMotor("5.8");
        microOnibus.setQuantidadePassageiros(24L);
        microOnibus.setAno(2021L);
        System.out.println(">>> " + microOnibus);

        System.out.println();
    }
}
