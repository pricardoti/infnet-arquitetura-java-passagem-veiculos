package br.edu.infnet.passagemveiculos.controllers.veiculos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AutoPasseioController {

    @GetMapping(value = "/auto-passeio/lista")
    public String telaLista() {
        return "/autopasseio/lista";
    }
}
