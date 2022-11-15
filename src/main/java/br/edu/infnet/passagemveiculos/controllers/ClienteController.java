package br.edu.infnet.passagemveiculos.controllers;

import br.edu.infnet.passagemveiculos.model.domain.Cliente;
import br.edu.infnet.passagemveiculos.model.service.ClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {

    private final ClienteService clienteService;

    // TAMBEM FAZ O AUTOWRIDE
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping(value = "/cliente/incluir")
    public String incluir() {
        return "cliente/cadastro";
    }

    @PostMapping(value = "/cliente/incluir")
    public String incluir(Cliente cliente) {
        clienteService.incluir(cliente);
        return "redirect:/cliente/lista";
    }

    @GetMapping(value = "/cliente/lista")
    public String telaLista(Model model) {
        model.addAttribute("clientes", clienteService.obterLista());
        return "/cliente/lista";
    }

    @GetMapping(value = "/cliente/{id_cliente}/excluir")
    public String excluir(@PathVariable Integer id) {
        clienteService.excluir(id);
        return "redirect:/cliente/lista";
    }
}
