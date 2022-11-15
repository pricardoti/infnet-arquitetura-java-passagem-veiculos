package br.edu.infnet.passagemveiculos.controllers.veiculos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PasseioController {

    @GetMapping(value = "/veiculos/passeio/lista")
    public String telaLista() {
        return "/veiculos/passeio/lista";
    }
}
