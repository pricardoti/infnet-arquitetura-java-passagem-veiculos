package br.edu.infnet.passagemveiculos.controllers;

import br.edu.infnet.passagemveiculos.model.domain.Passagem;
import br.edu.infnet.passagemveiculos.model.service.ClienteService;
import br.edu.infnet.passagemveiculos.model.service.PassagemService;
import br.edu.infnet.passagemveiculos.model.service.veiculos.VeiculoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.format.DateTimeFormatter;

@Controller
public class PassagemController {

    private final PassagemService passagemService;
    private final ClienteService clienteService;
    private final VeiculoService veiculoService;

    public PassagemController(
            PassagemService passagemService,
            ClienteService clienteService,
            VeiculoService veiculoService
    ) {
        this.passagemService = passagemService;
        this.clienteService = clienteService;
        this.veiculoService = veiculoService;
    }

    @GetMapping(value = "/passagem/incluir")
    public String incluir(Model model) {
        model.addAttribute("clientes", clienteService.obterLista());
        model.addAttribute("veiculos", veiculoService.obterLista());
        return "passagem/cadastro";
    }

    @PostMapping(value = "/passagem/incluir")
    public String incluir(Passagem passagem) {
        passagemService.incluir(passagem);
        return "redirect:/passagem/lista";
    }

    @GetMapping(value = "/passagem/lista")
    public String telaLista(Model model) {
        model.addAttribute("localDateTimeFormat", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        model.addAttribute("passagens", passagemService.obterLista());
        return "/passagem/lista";
    }

    @GetMapping(value = "/passagem/{id_passagem}/excluir")
    public String excluir(@PathVariable("id_passagem") Integer id) {
        passagemService.excluir(id);
        return "redirect:/passagem/lista";
    }
}
