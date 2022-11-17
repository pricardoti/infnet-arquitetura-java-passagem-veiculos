package br.edu.infnet.passagemveiculos.clients;

import br.edu.infnet.passagemveiculos.model.domain.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(url = "localhost:8081/api/usuario", name = "usuarioClient")
public interface IUsuarioClient {

    @PostMapping(value = "/incluir")
    void incluir(@RequestBody Usuario usuario);

    @DeleteMapping(value = "/{id}/excluir")
    void excluir(@PathVariable Integer id);

    @GetMapping(value = "/listar")
    List<Usuario> obterLista();

    @PostMapping(value = "/validar")
    Usuario validar(@RequestParam String email, @RequestParam String senha);
}