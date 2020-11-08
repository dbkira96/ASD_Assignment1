package it.unical.asd.Assignment1.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CedolaKey implements Serializable {
    @Column(name="codice_ISIN")
    Long codiceISINCedola;

    @Column(name="progressivo_cedola")
    Long progressivoCedola;
}
