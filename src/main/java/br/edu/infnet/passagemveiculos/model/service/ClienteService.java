package br.edu.infnet.passagemveiculos.model.service;

import br.edu.infnet.passagemveiculos.model.domain.Cliente;
import br.edu.infnet.passagemveiculos.model.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Collection<Cliente> obterLista() {
        return (Collection<Cliente>) clienteRepository.findAll();
    }

    public Cliente incluir(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void excluir(Integer id) {
        clienteRepository.deleteById(id);
    }
}
