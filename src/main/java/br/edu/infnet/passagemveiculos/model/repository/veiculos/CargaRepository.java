package br.edu.infnet.passagemveiculos.model.repository.veiculos;

import br.edu.infnet.passagemveiculos.model.domain.veiculos.Carga;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargaRepository extends CrudRepository<Carga, Integer> {
}
