package br.edu.infnet.passagemveiculos.controllers.veiculos;

import br.edu.infnet.passagemveiculos.model.domain.Usuario;
import br.edu.infnet.passagemveiculos.model.domain.veiculos.CategoriaEnum;
import br.edu.infnet.passagemveiculos.model.domain.veiculos.Passeio;
import br.edu.infnet.passagemveiculos.model.service.veiculos.PasseioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class PasseioController {

    private final PasseioService passeioService;

    public PasseioController(PasseioService passeioService) {
        this.passeioService = passeioService;
    }

    @GetMapping(value = "/veiculos/passeio/incluir")
    public String incluir(
            Model model,
            @SessionAttribute("usuarioSessao") Usuario usuarioSessao
    ) {
        model.addAttribute("categorias", CategoriaEnum.values());
        return "/veiculos/passeio/cadastro";
    }

    @PostMapping(value = "/veiculos/passeio/incluir")
    public String incluir(
            Passeio passeio,
            @SessionAttribute("usuarioSessao") Usuario usuarioSessao
    ) {
        passeioService.incluir(passeio);
        return "redirect:/veiculos/passeio/lista";
    }

    @GetMapping(value = "/veiculos/passeio/lista")
    public String telaLista(
            Model model,
            @SessionAttribute("usuarioSessao") Usuario usuarioSessao
    ) {
        model.addAttribute("veiculos", passeioService.obterLista());
        return "/veiculos/passeio/lista";
    }

    @GetMapping(value = "/veiculos/passeio/{id_passeio}/excluir")
    public String excluir(
            @PathVariable("id_passeio") Integer id,
            @SessionAttribute("usuarioSessao") Usuario usuarioSessao
    ) {
        passeioService.excluir(id);
        return "redirect:/veiculos/passeio/lista";
    }
}
