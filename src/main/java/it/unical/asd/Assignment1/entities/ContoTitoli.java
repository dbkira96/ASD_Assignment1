package it.unical.asd.Assignment1.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ContoTitoli {
    @Id
    @GeneratedValue
    @Column(name="NUMEROCONTO")
    private Long numeroConto;

    public String tipoConto() {
        return tipoConto;
    }

    public void setTipoConto(String tipoConto) {
        this.tipoConto = tipoConto;
    }

    @Column(name="TIPOCONTO")
    String tipoConto;

    @OneToMany()
    @JoinColumn(name="numero_conto")
    Set<Movimento> movimenti;

    @OneToMany()
    @JoinColumn(name="numero_conto")
    Set<SaldoPerTitolo> saldiPerTitolo;


}
