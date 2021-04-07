package br.com.unialfa.cargotransp.CagoTransp.Client.domain;

import br.com.unialfa.cargotransp.CagoTransp.Address.domain.Address;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;

    public long getId() { return this.id; }
    public String getName() { return this.name; }
    public String getEmail() { return this.email; }

    public Client setId(long id) {
        this.id = id;
        return this;
    }

    public Client setName(String name) {
        this.name = name;
        return this;
    }

    public Client setEmail(String email) {
        this.email = email;
        return this;
    }
}
