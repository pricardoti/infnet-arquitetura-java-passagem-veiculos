package br.edu.infnet.passagemveiculos.model.test;

import br.edu.infnet.passagemveiculos.controllers.ClienteController;
import br.edu.infnet.passagemveiculos.model.domain.Cliente;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class ClienteTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println();
        System.out.println("..:: Runner Cliente ::..");

        Cliente cliente1 = new Cliente();
        cliente1.setCpfCnpj("158.125.030-44");
        cliente1.setNome("Primeiro Cliente");
        cliente1.setEmail("nicifi3090@adroh.com");
        ClienteController.incluir(cliente1);
        System.out.println(">>> " + cliente1);

        Cliente cliente2 = new Cliente();
        cliente2.setCpfCnpj("147.922.640-81");
        cliente2.setNome("Segundo Cliente");
        cliente2.setEmail("derrick.rath@gmail.com");
        ClienteController.incluir(cliente2);
        System.out.println(">>> " + cliente2);

        Cliente cliente3 = new Cliente();
        cliente3.setCpfCnpj("28.197.869/0001-97");
        cliente3.setNome("Empresa Cliente");
        cliente3.setEmail("ettie73@gmail.com");
        ClienteController.incluir(cliente3);
        System.out.println(">>> " + cliente3);

        System.out.println();
    }
}
