package br.edu.infnet.passagemveiculos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppPassagemVeiculosController {

    @GetMapping(value = "/")
    public String telaHome() {
        return "home";
    }
}
