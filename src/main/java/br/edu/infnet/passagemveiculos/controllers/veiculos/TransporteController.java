package br.edu.infnet.passagemveiculos.controllers.veiculos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TransporteController {

    @GetMapping(value = "/veiculos/transporte/lista")
    public String telaLista() {
        return "/veiculos/transporte/lista";
    }
}
