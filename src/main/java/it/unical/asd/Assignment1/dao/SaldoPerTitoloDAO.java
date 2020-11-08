package it.unical.asd.Assignment1.dao;

import it.unical.asd.Assignment1.entities.SaldoPerTitolo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaldoPerTitoloDAO extends CrudRepository<SaldoPerTitolo,Long> {
}
