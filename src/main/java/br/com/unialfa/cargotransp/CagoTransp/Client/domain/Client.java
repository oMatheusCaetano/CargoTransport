package br.com.unialfa.cargotransp.CagoTransp.Client.domain;

public class Client {

    private String name;
    private String email;

    public String getName() { return this.name; }
    public String getEmail() { return this.email; }

    public Client setName(String name) {
        this.name = name;
        return this;
    }

    public Client setEmail(String email) {
        this.email = email;
        return this;
    }
}
