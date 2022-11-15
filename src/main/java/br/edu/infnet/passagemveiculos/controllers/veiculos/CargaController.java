package br.edu.infnet.passagemveiculos.controllers.veiculos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CargaController {

    @GetMapping(value = "/veiculos/carga/lista")
    public String telaLista() {
        return "/veiculos/carga/lista";
    }
}
