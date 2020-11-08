package it.unical.asd.Assignment1.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Titolo {
    @Id
    @GeneratedValue
    @Column(name="codice_ISIN")
     Long codiceISIN;

    @OneToMany()
    @JoinColumn(name="codice_ISIN")
    Set<Cedola> cedole;

    @OneToMany()
    @JoinColumn(name="codice_ISIN")
    Set<SaldoPerTitolo> saldiperiltitolo;

    @OneToMany()
    @JoinColumn(name="codice_ISIN")
    Set<Movimento> movimenti;

    @Column(name = "DESCRIZIONE")
    private String descrizione;

    @Column(name = "SCADENZA")
    private Date scadenza;

    @Column(name = "TASSO")
    private Integer tasso;

    @Column(name = "EMITTENTE")
    private String emittente;

    @Column(name = "VALORE_NOMINALE")
    private Integer valoreNominale;
}
