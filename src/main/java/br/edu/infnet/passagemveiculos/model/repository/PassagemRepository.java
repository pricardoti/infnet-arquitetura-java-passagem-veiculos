package br.edu.infnet.passagemveiculos.model.repository;

import br.edu.infnet.passagemveiculos.model.domain.Passagem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassagemRepository extends CrudRepository<Passagem, Integer> {
}
