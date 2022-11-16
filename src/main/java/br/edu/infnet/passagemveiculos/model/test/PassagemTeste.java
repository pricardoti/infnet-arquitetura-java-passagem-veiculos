package br.edu.infnet.passagemveiculos.model.test;

import br.edu.infnet.passagemveiculos.model.domain.Cliente;
import br.edu.infnet.passagemveiculos.model.domain.Passagem;
import br.edu.infnet.passagemveiculos.model.domain.veiculos.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

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
        passeio2.setPlaca("AUT-0002");
        passeio2.setFabricante("Volkswagen");
        passeio2.setModelo("Gol Confortline");
        passeio2.setMotor("1.0");
        passeio2.setCategoria(CategoriaEnum.HATCH);
        passeio2.setAno(2022L);

        Passeio passeio3 = new Passeio();
        passeio3.setPlaca("AUT-0003");
        passeio3.setFabricante("Volkswagen");
        passeio3.setModelo("Amarok Highline");
        passeio3.setMotor("3.0 Turbo");
        passeio3.setCategoria(CategoriaEnum.PICKUP);
        passeio3.setAno(2023L);

        List<Veiculo> veiculos1 = List.of(passeio1, passeio2);
        List<Veiculo> veiculos2 = List.of(passeio3);

        Passagem passagem1 = new Passagem(cliente1);
        passagem1.setGuiche("Guichê 01 - Sentido Norte");
        passagem1.setPraca("Litoral Norte SP");
        passagem1.setOperador("Joãozinho");
        passagem1.setVeiculos(veiculos1);
        System.out.println(">>> " + passagem1);

        Passagem passagem2 = new Passagem(cliente1);
        passagem2.setGuiche("Guichê 02 - Sentido Leste");
        passagem2.setPraca("Litoral Norte SP");
        passagem2.setOperador("Mariazinha");
        passagem2.setVeiculos(veiculos2);
        System.out.println(">>> " + passagem2);

        Cliente cliente2 = new Cliente();
        cliente2.setCpfCnpj("147.922.640-81");
        cliente2.setNome("Segundo Cliente");
        cliente2.setEmail("derrick.rath@gmail.com");

        Transporte onibus1 = new Transporte();
        onibus1.setPlaca("TTT-0001");
        onibus1.setFabricante("Scania");
        onibus1.setModelo("Euro 6 K280 4x2");
        onibus1.setMotor("13.0");
        onibus1.setQuantidadePassageiros(115L);
        onibus1.setAno(2022L);

        Carga caminhao1 = new Carga();
        caminhao1.setPlaca("AAA-1111");
        caminhao1.setFabricante("Volvo");
        caminhao1.setModelo("FH 540");
        caminhao1.setMotor("12.8");
        caminhao1.setCarroceria(PRANCHA);
        caminhao1.setAno(2022L);

        List<Veiculo> veiculos3 = List.of(onibus1, caminhao1, passeio3);

        Passagem passagem3 = new Passagem(cliente2);
        passagem3.setGuiche("Guichê 05 - Sentido Sul");
        passagem3.setPraca("Zona Sul MG");
        passagem3.setOperador("Zezinho");
        passagem3.setVeiculos(veiculos3);
        System.out.println(">>> " + passagem3);

        System.out.println();
    }
}
