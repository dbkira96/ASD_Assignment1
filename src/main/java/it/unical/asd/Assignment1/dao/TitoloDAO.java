package it.unical.asd.Assignment1.dao;

import it.unical.asd.Assignment1.entities.Titolo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitoloDAO extends CrudRepository<Titolo,Long> {
}
