package br.com.unialfa.cargotransp.CagoTransp.Delivery.domain;

import br.com.unialfa.cargotransp.CagoTransp.Client.domain.Client;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDate created;
    private LocalDate expected;
    private LocalDate conclusion;
    private BigDecimal subTotal;
    private BigDecimal total;

    public long getId() { return this.id; }
    public LocalDate getExpected() { return this.expected; }
    public LocalDate getCreated() { return this.created; }
    public LocalDate getConclusion() { return this.conclusion; }
    public BigDecimal getSubTotal() { return this.subTotal; }
    public BigDecimal getTotal() { return this.total; }

    public Delivery setId(long id) {
        this.id = id;
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
