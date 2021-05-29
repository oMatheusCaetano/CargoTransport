package br.com.unialfa.cargotransp.CagoTransp.Address.domain;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String street;
    private String zipCode;
    private String complement;
    private String city;
    private String state;
    private String country;
    private int number;

    public long getId() { return this.id; }
    public String getStreet() { return this.street; }
    public String getZipCode() { return this.zipCode; }
    public String getComplement() { return this.complement; }
    public String getCity() { return this.city; }
    public String getState() { return this.state; }
    public String getCountry() { return this.country; }
    public int getNumber() { return this.number; }

    public Address setId(long id) {
        this.id = id;
        return this;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public Address setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public Address setComplement(String complement) {
        this.complement = complement;
        return this;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public Address setState(String state) {
        this.state = state;
        return this;
    }

    public Address setCountry(String country) {
        this.country = country;
        return this;
    }

    public Address setNumber(int number) {
        this.number = number;
        return this;
    }
}
