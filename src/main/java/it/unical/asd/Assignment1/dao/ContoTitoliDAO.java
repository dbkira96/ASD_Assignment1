package it.unical.asd.Assignment1.dao;

import it.unical.asd.Assignment1.entities.ContoTitoli;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContoTitoliDAO extends CrudRepository<ContoTitoli,Long> {
}
