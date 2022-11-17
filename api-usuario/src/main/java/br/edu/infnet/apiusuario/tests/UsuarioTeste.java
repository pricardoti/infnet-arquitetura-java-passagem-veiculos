package br.edu.infnet.apiusuario.tests;

import br.edu.infnet.apiusuario.model.domain.Endereco;
import br.edu.infnet.apiusuario.model.domain.Usuario;
import br.edu.infnet.apiusuario.model.service.UsuarioService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class UsuarioTeste implements ApplicationRunner {

    private final UsuarioService usuarioService;

    public UsuarioTeste(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println();
        System.out.println("..:: Runner Cadastro Usuario ::..");

        Endereco endereco = new Endereco();
        endereco.setBairro("Morumbi");
        endereco.setCep("05711000");
        endereco.setUf("SP");
        endereco.setLogradouro("R. Doutor Luiz Migliano");

        Usuario usuario = new Usuario();
        usuario.setNome("Administrador");
        usuario.setEmail("adm@infnet.edu.br");
        usuario.setSenha("123");
        usuario.setEndereco(endereco);

        usuarioService.incluir(usuario);

        System.out.println(">>> " + usuario);
        System.out.println();
    }
}
