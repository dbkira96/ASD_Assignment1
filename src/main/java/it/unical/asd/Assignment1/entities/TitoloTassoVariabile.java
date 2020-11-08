package it.unical.asd.Assignment1.entities;

import javax.persistence.Entity;

@Entity
public class TitoloTassoVariabile extends Titolo {
    private Long spread;

    public Long spread() {
        return spread;
    }
}
