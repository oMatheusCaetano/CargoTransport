package br.com.unialfa.cargotransp.CagoTransp.Phone.domain;

import br.com.unialfa.cargotransp.CagoTransp.Address.domain.Address;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String number;

    public long getId() { return this.id; }
    public String getNumber() { return this.number; }

    public Phone setId(long id) {
        this.id = id;
        return this;
    }
    public Phone setNumber(String number) {
        this.number = number;
        return this;
    }
}
