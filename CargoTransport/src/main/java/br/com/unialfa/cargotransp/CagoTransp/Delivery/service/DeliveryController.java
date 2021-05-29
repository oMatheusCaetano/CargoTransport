package br.com.unialfa.cargotransp.CagoTransp.Delivery.service;

import br.com.unialfa.cargotransp.CagoTransp.Delivery.domain.Delivery;
import br.com.unialfa.cargotransp.CagoTransp.Delivery.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/delivery", produces = MediaType.APPLICATION_JSON_VALUE)
public class DeliveryController {

    @Autowired
    private DeliveryRepository repository;

    @GetMapping
    public Iterable<Delivery> all() { return this.repository.findAll(); }

    @GetMapping(path = "/{id}")
    public Optional<Delivery> find(@PathVariable long id) { return this.repository.findById(id); }
}
