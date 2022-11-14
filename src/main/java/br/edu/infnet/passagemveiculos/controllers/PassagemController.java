package br.edu.infnet.passagemveiculos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PassagemController {

    @GetMapping(value = "/passagem/lista")
    public String telaLista() {
        return "/passagem/lista";
    }
}
