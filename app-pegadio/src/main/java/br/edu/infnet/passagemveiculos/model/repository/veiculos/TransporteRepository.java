package br.edu.infnet.passagemveiculos.model.repository.veiculos;

import br.edu.infnet.passagemveiculos.model.domain.veiculos.Transporte;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransporteRepository extends CrudRepository<Transporte, Integer> {
}
