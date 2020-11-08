package it.unical.asd.Assignment1.entities;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
public class Cedola {
    @EmbeddedId
    CedolaKey idCedola;


    @ManyToOne
    @MapsId("codiceISIN")
    @JoinColumn(name="codice_ISIN_Titolo",referencedColumnName="codice_ISIN")
    Titolo titolo;

    public Date scadenza() {
        return scadenza;
    }

    public void setScadenza(Date scadenza) {
        this.scadenza = scadenza;
    }

    public Integer valore() {
        return valore;
    }

    public void setValore(Integer valore) {
        this.valore = valore;
    }

    @Column(name = "SCADENZA")
    private Date scadenza;

    @Column(name = "VALORE")
    private Integer valore;
}
