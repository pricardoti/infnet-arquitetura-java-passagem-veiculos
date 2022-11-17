package br.edu.infnet.passagemveiculos.model.service;

import br.edu.infnet.passagemveiculos.model.domain.Passagem;
import br.edu.infnet.passagemveiculos.model.repository.PassagemRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PassagemService {

    private final PassagemRepository passagemRepository;

    public PassagemService(PassagemRepository passagemRepository) {
        this.passagemRepository = passagemRepository;
    }

    public Collection<Passagem> obterLista(Integer usuarioId) {
        return passagemRepository.findByIdUsuario(usuarioId);
    }

    public Passagem incluir(Passagem passagem) {
        return passagemRepository.save(passagem);
    }

    public void excluir(Integer id) {
        passagemRepository.deleteById(id);
    }
}
