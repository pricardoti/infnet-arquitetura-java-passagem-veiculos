package br.edu.infnet.passagemveiculos.model.repository.veiculos;

import br.edu.infnet.passagemveiculos.model.domain.veiculos.Veiculo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends CrudRepository<Veiculo, Integer> {
}
