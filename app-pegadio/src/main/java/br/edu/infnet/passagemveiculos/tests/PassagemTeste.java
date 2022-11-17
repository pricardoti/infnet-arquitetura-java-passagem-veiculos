package br.edu.infnet.passagemveiculos.tests;

import br.edu.infnet.passagemveiculos.model.domain.Cliente;
import br.edu.infnet.passagemveiculos.model.domain.Passagem;
import br.edu.infnet.passagemveiculos.model.domain.veiculos.Carga;
import br.edu.infnet.passagemveiculos.model.domain.veiculos.CategoriaEnum;
import br.edu.infnet.passagemveiculos.model.domain.veiculos.Passeio;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import static br.edu.infnet.passagemveiculos.model.domain.veiculos.CarroceriaEnum.PRANCHA;

@Order(3)
@Component
public class PassagemTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println();
        System.out.println("..:: Runner Passagem ::..");

        Cliente cliente1 = new Cliente();
        cliente1.setCpfCnpj("158.125.030-44");
        cliente1.setNome("Primeiro Cliente");
        cliente1.setEmail("nicifi3090@adroh.com");

        Passeio passeio1 = new Passeio();
        passeio1.setPlaca("AUT-0001");
        passeio1.setFabricante("Volkswagen");
        passeio1.setModelo("T-Cross");
        passeio1.setMotor("250 TSI");
        passeio1.setCategoria(CategoriaEnum.SUV);
        passeio1.setAno(2021L);

        Passeio passeio2 = new Passeio();
        passeio2.setPlaca("AUT-0003");
        passeio2.setFabricante("Volkswagen");
        passeio2.setModelo("Amarok Highline");
        passeio2.setMotor("3.0 Turbo");
        passeio2.setCategoria(CategoriaEnum.PICKUP);
        passeio2.setAno(2023L);

        Passagem passagem1 = new Passagem(cliente1);
        passagem1.setGuiche(1);
        passagem1.setPraca("Litoral Norte SP");
        passagem1.setOperador("Joãozinho");
        passagem1.setVeiculo(passeio1);
        System.out.println(">>> " + passagem1);

        Passagem passagem2 = new Passagem(cliente1);
        passagem2.setGuiche(2);
        passagem2.setPraca("Litoral Norte SP");
        passagem2.setOperador("Mariazinha");
        passagem2.setVeiculo(passeio2);
        System.out.println(">>> " + passagem2);

        Cliente cliente2 = new Cliente();
        cliente2.setCpfCnpj("147.922.640-81");
        cliente2.setNome("Segundo Cliente");
        cliente2.setEmail("derrick.rath@gmail.com");

        Carga caminhao1 = new Carga();
        caminhao1.setPlaca("AAA-1111");
        caminhao1.setFabricante("Volvo");
        caminhao1.setModelo("FH 540");
        caminhao1.setMotor("12.8");
        caminhao1.setCarroceria(PRANCHA);
        caminhao1.setAno(2022L);

        Passagem passagem3 = new Passagem(cliente2);
        passagem3.setGuiche(5);
        passagem3.setPraca("Zona Sul MG");
        passagem3.setOperador("Zezinho");
        passagem3.setVeiculo(caminhao1);
        System.out.println(">>> " + passagem3);

        System.out.println();
    }
}
