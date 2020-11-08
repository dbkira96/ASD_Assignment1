package it.unical.asd.Assignment1.dao;

import it.unical.asd.Assignment1.entities.Movimento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentoDAO extends CrudRepository<Movimento, Long> {

}
