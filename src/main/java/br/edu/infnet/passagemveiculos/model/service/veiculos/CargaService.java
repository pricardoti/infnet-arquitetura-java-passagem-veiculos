package br.edu.infnet.passagemveiculos.model.service.veiculos;

import br.edu.infnet.passagemveiculos.model.domain.veiculos.Carga;
import br.edu.infnet.passagemveiculos.model.repository.veiculos.CargaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CargaService {

    private final CargaRepository cargaRepository;

    public CargaService(CargaRepository cargaRepository) {
        this.cargaRepository = cargaRepository;
    }

    public Collection<Carga> obterLista() {
        return (Collection<Carga>) cargaRepository.findAll();
    }

    public Carga incluir(Carga carga) {
        return cargaRepository.save(carga);
    }

    public void excluir(Integer id) {
        cargaRepository.deleteById(id);
    }
}
