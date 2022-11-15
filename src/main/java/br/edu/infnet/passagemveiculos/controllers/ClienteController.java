package br.edu.infnet.passagemveiculos.controllers;

import br.edu.infnet.passagemveiculos.model.domain.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ClienteController {

    private static List<Cliente> clientes = new ArrayList<>();

    public static void incluir(Cliente cliente) {
        clientes.add(cliente);
    }

    @GetMapping(value = "/cliente/lista")
    public String telaLista(Model model) {
        model.addAttribute("clientes", clientes);
        return "/cliente/lista";
    }
}
