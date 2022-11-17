package br.edu.infnet.passagemveiculos.controllers;

import br.edu.infnet.passagemveiculos.model.domain.Usuario;
import br.edu.infnet.passagemveiculos.model.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes("usuarioSessao")
public class AutenticacaoController {

    private final UsuarioService usuarioService;

    public AutenticacaoController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping(value = "/login")
    public String telaLogin() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(
            Model model,
            @RequestParam String email,
            @RequestParam String senha
    ) {
        Usuario usuario = usuarioService.validar(email, senha);
        if (usuario == null) return "login";

        model.addAttribute("usuarioSessao", usuario);
        return "home";
    }

    @GetMapping(value = "/logout")
    public String logout(HttpSession session, SessionStatus status) {
        status.setComplete();
        session.removeAttribute("usuarioSessao");
        return "redirect:/";
    }
}
