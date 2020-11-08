package it.unical.asd.Assignment1.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class MovimentoKey implements Serializable {
    @Column(name = "numero_conto")
    Long numeroConto;

    @Column(name = "data")
     Date data;

    @Column(name="progressivo")
     Long progressivo;
}
