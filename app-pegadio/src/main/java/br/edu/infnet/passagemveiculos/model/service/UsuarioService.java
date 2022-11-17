package br.edu.infnet.passagemveiculos.model.service;

import br.edu.infnet.passagemveiculos.clients.IEnderecoClient;
import br.edu.infnet.passagemveiculos.clients.IUsuarioClient;
import br.edu.infnet.passagemveiculos.model.domain.Endereco;
import br.edu.infnet.passagemveiculos.model.domain.Usuario;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UsuarioService {

    private final IEnderecoClient enderecoClient;
    private final IUsuarioClient usuarioClient;

    public UsuarioService(
            IEnderecoClient enderecoClient,
            IUsuarioClient usuarioClient
    ) {
        this.enderecoClient = enderecoClient;
        this.usuarioClient = usuarioClient;
    }

    public void incluir(Usuario usuario) {
        usuarioClient.incluir(usuario);
    }

    public void excluir(Integer id) {
        usuarioClient.excluir(id);
    }

    public Collection<Usuario> obterLista() {
        return usuarioClient.obterLista();
    }

    public Usuario validar(String email, String senha) {
        return usuarioClient.validar(email, senha);
    }

    public Endereco obterCep(String cep) {
        return enderecoClient.obterCep(cep);
    }
}
