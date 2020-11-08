package it.unical.asd.Assignment1.entities;

import javax.persistence.*;

@Entity
public class Movimento {
    @EmbeddedId
    MovimentoKey idMovimento;

    @ManyToOne
    @MapsId("numeroConto")
    @JoinColumn(name="numero_conto")
    ContoTitoli contoTitoli;

   @Column(name="tipo_movimento")
   String tipoMovimento;

    public String tipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public Long quantità() {
        return quantità;
    }

    public void setQuantità(Long quantità) {
        this.quantità = quantità;
    }

    @Column(name="quantità")
   Long quantità;

    @ManyToOne
    @MapsId("codiceISIN")
    @JoinColumn(name="codice_ISIN")
    Titolo titolo;
}
