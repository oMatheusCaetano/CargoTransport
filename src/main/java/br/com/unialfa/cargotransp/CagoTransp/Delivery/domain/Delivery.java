package br.com.unialfa.cargotransp.CagoTransp.Delivery.domain;

import br.com.unialfa.cargotransp.CagoTransp.Address.domain.Address;
import br.com.unialfa.cargotransp.CagoTransp.Cargo.domain.Cargo;
import br.com.unialfa.cargotransp.CagoTransp.Client.domain.Client;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Cargo cargo;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    private LocalDate created;
    private LocalDate expected;
    private LocalDate conclusion;
    private BigDecimal subTotal;
    private BigDecimal total;

    public long getId() { return this.id; }
    public Cargo getCargo() { return this.cargo; }
    public Address getAddress() { return this.address; }
    public LocalDate getExpected() { return this.expected; }
    public LocalDate getCreated() { return this.created; }
    public LocalDate getConclusion() { return this.conclusion; }
    public BigDecimal getSubTotal() { return this.subTotal; }
    public BigDecimal getTotal() { return this.total; }

    public Delivery setId(long id) {
        this.id = id;
        return this;
    }

    public Delivery setCargo(Cargo cargo) {
        this.cargo = cargo;
        return this;
    }

    public Delivery setAddress(Address address) {
        this.address = address;
        return this;
    }

    public Delivery setCreated(LocalDate created) {
        this.created = created;
        return this;
    }

    public Delivery setExpected(LocalDate expected) {
        this.expected = expected;
        return this;
    }

    public Delivery setConclusion(LocalDate conclusion) {
        this.conclusion = conclusion;
        return this;
    }

    public Delivery setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
        return this;
    }

    public Delivery setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }
}
