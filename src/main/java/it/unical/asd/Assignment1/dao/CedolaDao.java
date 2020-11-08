package it.unical.asd.Assignment1.dao;

import it.unical.asd.Assignment1.entities.Cedola;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CedolaDao extends CrudRepository<Cedola,Long> {
}
