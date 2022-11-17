package br.edu.infnet.passagemveiculos.model.repository;

import br.edu.infnet.passagemveiculos.model.domain.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
}
