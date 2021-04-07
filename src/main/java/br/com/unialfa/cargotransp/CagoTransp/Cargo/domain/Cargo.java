package br.com.unialfa.cargotransp.CagoTransp.Cargo.domain;

import br.com.unialfa.cargotransp.CagoTransp.Address.domain.Address;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Double weight;
    private Double width;
    private Double height;

    public long getId() { return this.id; }
    public Double getWeight() { return this.weight; }
    public Double getWidth() { return this.width; }
    public Double getHeight() { return this.height; }

    public Cargo setId(long id) {
        this.id = id;
        return this;
    }

    public Cargo setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public Cargo setWidth(Double width) {
        this.width = width;
        return this;
    }

    public Cargo setHeight(Double height) {
        this.height = height;
        return this;
    }
}
