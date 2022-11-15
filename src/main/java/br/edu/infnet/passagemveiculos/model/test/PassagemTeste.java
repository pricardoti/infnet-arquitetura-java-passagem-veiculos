package br.edu.infnet.passagemveiculos.model.test;

import br.edu.infnet.passagemveiculos.model.domain.Cliente;
import br.edu.infnet.passagemveiculos.model.domain.Passagem;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Order(3)
@Component
public class PassagemTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println();
        System.out.println("..:: Runner Passagem ::..");

        LocalDateTime dataHora = LocalDateTime.now();

        Cliente cliente1 = new Cliente();
        cliente1.setCpfCnpj("158.125.030-44");
        cliente1.setNome("Primeiro Cliente");
        cliente1.setEmail("nicifi3090@adroh.com");

        Passagem passagem1 = new Passagem();
        passagem1.setDataHora(dataHora);
        passagem1.setGuiche("Guichê 01 - Sentido Norte");
        passagem1.setPraca("Litoral Norte SP");
        passagem1.setOperador("Joãozinho");
        passagem1.setCliente(cliente1);
        System.out.println(">>> " + passagem1);

        Passagem passagem2 = new Passagem();
        passagem2.setDataHora(dataHora.minusDays(1));
        passagem2.setGuiche("Guichê 02 - Sentido Leste");
        passagem2.setPraca("Litoral Norte SP");
        passagem2.setOperador("Mariazinha");
        passagem2.setCliente(cliente1);
        System.out.println(">>> " + passagem2);

        Cliente cliente2 = new Cliente();
        cliente2.setCpfCnpj("147.922.640-81");
        cliente2.setNome("Segundo Cliente");
        cliente2.setEmail("derrick.rath@gmail.com");

        Passagem passagem3 = new Passagem();
        passagem3.setDataHora(dataHora.minusDays(2));
        passagem3.setGuiche("Guichê 05 - Sentido Sul");
        passagem3.setPraca("Zona Sul MG");
        passagem3.setOperador("Zezinho");
        passagem3.setCliente(cliente2);
        System.out.println(">>> " + passagem3);

        System.out.println();
    }
}
