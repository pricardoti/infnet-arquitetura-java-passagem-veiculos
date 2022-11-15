package br.edu.infnet.passagemveiculos.controllers;

import br.edu.infnet.passagemveiculos.model.domain.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClienteController {

    @GetMapping(value = "/cliente/lista")
    public String telaLista(Model model) {

        Cliente cliente1 = new Cliente();
        cliente1.setCpfCnpj("158.125.030-44");
        cliente1.setNome("Primeiro Cliente");
        cliente1.setEmail("nicifi3090@adroh.com");

        Cliente cliente2 = new Cliente();
        cliente2.setCpfCnpj("147.922.640-81");
        cliente2.setNome("Segundo Cliente");
        cliente2.setEmail("derrick.rath@gmail.com");

        Cliente cliente3 = new Cliente();
        cliente3.setCpfCnpj("28.197.869/0001-97");
        cliente3.setNome("Empresa Cliente");
        cliente3.setEmail("ettie73@gmail.com");

        List<Cliente> clientes = List.of(cliente1, cliente2, cliente3);
        model.addAttribute("clientes", clientes);

        return "/cliente/lista";
    }
}
