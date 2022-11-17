package br.edu.infnet.apiusuario.controller;

import br.edu.infnet.apiusuario.model.domain.Usuario;
import br.edu.infnet.apiusuario.model.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

	private final UsuarioService usuarioService;

	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Usuario usuario) {
		usuarioService.incluir(usuario);
	}
	
	@DeleteMapping(value = "/{id_usuario}/excluir")
	public void excluir(@PathVariable("id_usuario") Integer id) {
		usuarioService.excluir(id);
	}
	
	@GetMapping(value = "/listar")
	public List<Usuario> obterLista(){
		return usuarioService.obterLista();
	}
	
	@PostMapping(value = "/validar")
	public Usuario validar(@RequestParam String email, @RequestParam String senha) {
		return usuarioService.validar(email, senha);
	}
}
