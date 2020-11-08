package it.unical.asd.Assignment1.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SaldoPerTitoloKey implements Serializable {

    @Column(name="numero_conto")
    Long numeroConto;
    @Column(name="codice_ISIN")
    Long codiceISIN;
}
