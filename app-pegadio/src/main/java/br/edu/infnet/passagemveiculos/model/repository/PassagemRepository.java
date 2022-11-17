package br.edu.infnet.passagemveiculos.model.repository;

import br.edu.infnet.passagemveiculos.model.domain.Passagem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PassagemRepository extends CrudRepository<Passagem, Integer> {

    @Query("SELECT p FROM Passagem p WHERE p.usuario.id = :usarioId")
    Collection<Passagem> findByIdUsuario(Integer usarioId);
}
