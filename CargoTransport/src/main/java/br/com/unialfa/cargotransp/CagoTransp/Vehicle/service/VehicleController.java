package br.com.unialfa.cargotransp.CagoTransp.Vehicle.service;

import br.com.unialfa.cargotransp.CagoTransp.Vehicle.domain.Vehicle;
import br.com.unialfa.cargotransp.CagoTransp.Vehicle.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/vehicle", produces = MediaType.APPLICATION_JSON_VALUE)
public class VehicleController {

    @Autowired
    private VehicleRepository repository;

    @GetMapping
    public Iterable<Vehicle> all() { return this.repository.findAll(); }

    @GetMapping(path = "/{id}")
    public Optional<Vehicle> find(@PathVariable long id) { return this.repository.findById(id); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void store(@RequestBody Vehicle vehicle) { this.repository.save(vehicle); }

    @PutMapping
    public void update(@RequestBody Vehicle vehicle) { this.repository.save(vehicle); }

    @DeleteMapping(path = "/{id}")
    @ResponseBody
    public void destroy(@PathVariable(name = "id") long id) { this.repository.deleteById(id); }

}
