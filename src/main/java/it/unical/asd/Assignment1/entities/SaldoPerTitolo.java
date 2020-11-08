package it.unical.asd.Assignment1.entities;

import jdk.jfr.Unsigned;

import javax.persistence.*;

@Entity
public class SaldoPerTitolo {
    @EmbeddedId
    SaldoPerTitoloKey idSaldoPerTitolo;

    @ManyToOne
    @MapsId("codiceISIN")
    @JoinColumn(name="codiceTitolo")
    Titolo titolo;

    @ManyToOne
    @MapsId("numeroConto")
    @JoinColumn(name="codiceContoTitoli")
    ContoTitoli contoTitoli;

    @Column(name = "QUANTITA")
    private Integer quantita;


}
