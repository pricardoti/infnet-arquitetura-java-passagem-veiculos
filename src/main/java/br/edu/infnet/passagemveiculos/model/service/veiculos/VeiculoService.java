package br.edu.infnet.passagemveiculos.model.service.veiculos;

import br.edu.infnet.passagemveiculos.model.domain.veiculos.Veiculo;
import br.edu.infnet.passagemveiculos.model.repository.veiculos.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public Collection<Veiculo> obterLista() {
        return (Collection<Veiculo>) veiculoRepository.findAll();
    }
}
