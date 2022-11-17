package br.edu.infnet.passagemveiculos.model.service.veiculos;

import br.edu.infnet.passagemveiculos.model.domain.veiculos.Passeio;
import br.edu.infnet.passagemveiculos.model.repository.veiculos.PasseioRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PasseioService {

    private final PasseioRepository passeioRepository;

    public PasseioService(PasseioRepository passeioRepository) {
        this.passeioRepository = passeioRepository;
    }

    public Collection<Passeio> obterLista() {
        return (Collection<Passeio>) passeioRepository.findAll();
    }

    public Passeio incluir(Passeio passeio) {
        return passeioRepository.save(passeio);
    }

    public void excluir(Integer id) {
        passeioRepository.deleteById(id);
    }
}
