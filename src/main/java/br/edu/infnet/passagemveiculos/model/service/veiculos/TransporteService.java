package br.edu.infnet.passagemveiculos.model.service.veiculos;

import br.edu.infnet.passagemveiculos.model.domain.veiculos.Transporte;
import br.edu.infnet.passagemveiculos.model.repository.veiculos.TransporteRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TransporteService {

    private final TransporteRepository transporteRepository;

    public TransporteService(TransporteRepository transporteRepository) {
        this.transporteRepository = transporteRepository;
    }

    public Collection<Transporte> obterLista() {
        return (Collection<Transporte>) transporteRepository.findAll();
    }

    public Transporte incluir(Transporte passeio) {
        return transporteRepository.save(passeio);
    }

    public void excluir(Integer id) {
        transporteRepository.deleteById(id);
    }
}
