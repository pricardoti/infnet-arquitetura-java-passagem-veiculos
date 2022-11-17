package br.edu.infnet.passagemveiculos.controllers;

import br.edu.infnet.passagemveiculos.model.domain.Usuario;
import br.edu.infnet.passagemveiculos.model.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping(value = "/usuario/lista")
    public String telaLista(
            Model model,
            @SessionAttribute("usuarioSessao") Usuario usuarioSessao
    ) {
        model.addAttribute("listagem", usuarioService.obterLista());
        return "usuario/lista";
    }

    @GetMapping(value = "/usuario")
    public String telaCadastro() {
        return "usuario/cadastro";
    }

    @PostMapping(value = "/cep")
    public String obterCep(
            Model model,
            @RequestParam String cep
    ) {
        model.addAttribute("endereco", usuarioService.obterCep(cep));
        return "usuario/cadastro";
    }

    @PostMapping(value = "/usuario/incluir")
    public String incluir(Usuario usuario) {
        usuarioService.incluir(usuario);
        return "redirect:/login";
    }

    @GetMapping(value = "/usuario/{id_usuario}/excluir")
    public String excluir(
            @PathVariable("id_usuario") Integer id,
            @SessionAttribute("usuarioSessao") Usuario usuarioSessao
    ) {
        usuarioService.excluir(id);
        return "redirect:/usuario/lista";
    }
}
