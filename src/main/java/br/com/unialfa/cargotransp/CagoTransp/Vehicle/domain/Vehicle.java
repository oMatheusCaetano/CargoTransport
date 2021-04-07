package br.com.unialfa.cargotransp.CagoTransp.Vehicle.domain;

import javax.persistence.*;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Double capacity;
    private String brand;
    private String model;
    private int numberOfAxles;
    private VehicleStatus status;

    public long getId() { return this.id; }
    public Double getCapacity() { return this.capacity; }
    public String getBrand() { return this.brand; }
    public String getModel() { return this.model; }
    public int getNumberOfAxles() { return this.numberOfAxles; }
    public VehicleStatus getStatus() { return this.status; }

    public Vehicle setId(long id) {
        this.id = id;
        return this;
    }

    public Vehicle setCapacity(Double capacity) {
        this.capacity = capacity;
        return this;
    }

    public Vehicle setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Vehicle setModel(String model) {
        this.model = model;
        return this;
    }

    public Vehicle setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
        return this;
    }

    public Vehicle setStatus(VehicleStatus status) {
        this.status = status;
        return this;
    }
}
