package br.com.unialfa.cargotransp.CagoTransp.Cargo.domain;

public class Cargo {

    private Double weight;
    private Double width;
    private Double height;

    public Double getWeight() { return this.weight; }
    public Double getWidth() { return this.width; }
    public Double getHeight() { return this.height; }

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
