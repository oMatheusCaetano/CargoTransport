package br.com.unialfa.cargotransp.CagoTransp.Delivery.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Delivery {

    private LocalDate created;
    private LocalDate expected;
    private LocalDate conclusion;
    private BigDecimal subTotal;
    private BigDecimal total;

    public LocalDate getExpected() { return this.expected; }
    public LocalDate getCreated() { return this.created; }
    public LocalDate getConclusion() { return this.conclusion; }
    public BigDecimal getSubTotal() { return this.subTotal; }
    public BigDecimal getTotal() { return this.total; }

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
