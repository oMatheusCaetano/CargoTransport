package br.com.unialfa.cargotransp.CagoTransp;

import br.com.unialfa.cargotransp.CagoTransp.Address.domain.Address;
import br.com.unialfa.cargotransp.CagoTransp.Cargo.domain.Cargo;
import br.com.unialfa.cargotransp.CagoTransp.Client.domain.Client;
import br.com.unialfa.cargotransp.CagoTransp.Client.repository.ClientRepository;
import br.com.unialfa.cargotransp.CagoTransp.Delivery.domain.Delivery;
import br.com.unialfa.cargotransp.CagoTransp.Delivery.repository.DeliveryRepository;
import br.com.unialfa.cargotransp.CagoTransp.Vehicle.domain.Vehicle;
import br.com.unialfa.cargotransp.CagoTransp.Vehicle.domain.VehicleStatus;
import br.com.unialfa.cargotransp.CagoTransp.Vehicle.repository.VehicleRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

@SpringBootApplication
public class CagoTranspApplication {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private DeliveryRepository deliveryRepository;

    @Autowired
    private ClientRepository clientRepository;

    public static void main(String[] args) {
        SpringApplication.run(CagoTranspApplication.class, args);
    }

    @Bean
    InitializingBean sendDatabase() {
        // Seed Vehicles
        Vehicle[] vehicles = {
            new Vehicle()
                .setBrand("Volvo")
                .setModel("FH 16")
                .setNumberOfAxles(6)
                .setCapacity(10000.0)
                .setStatus(VehicleStatus.WORKING),
            new Vehicle()
                .setBrand("Volvo")
                .setModel("FH 16")
                .setNumberOfAxles(6)
                .setCapacity(10000.0)
                .setStatus(VehicleStatus.WORKING),
            new Vehicle()
                .setBrand("Volvo")
                .setModel("FH 16")
                .setNumberOfAxles(6)
                .setCapacity(10000.0)
                .setStatus(VehicleStatus.PARKED),
            new Vehicle()
                .setBrand("Mercedes")
                .setModel("Mercedes Truck")
                .setNumberOfAxles(6)
                .setCapacity(10000.0)
                .setStatus(VehicleStatus.MAINTENANCE),
            new Vehicle()
                .setBrand("Mercedes")
                .setModel("Mercedes Truck")
                .setNumberOfAxles(6)
                .setCapacity(10000.0)
                .setStatus(VehicleStatus.PARKED),
            new Vehicle()
                .setBrand("Scania")
                .setModel("Scania Truck")
                .setNumberOfAxles(8)
                .setCapacity(12000.0)
                .setStatus(VehicleStatus.SOLD),
        };

        for(Vehicle truck : vehicles){
            vehicleRepository.save(truck);
        }

        // Seed Clients
        Client[] clients = {
            new Client()
                .setName("Client Name")
                .setEmail("email@email.com"),
            new Client()
                .setName("Client Name")
                .setEmail("email@email.com"),
            new Client()
                .setName("Client Name")
                .setEmail("email@email.com"),
            new Client()
                .setName("Client Name")
                .setEmail("email@email.com"),
        };

        for(Client client : clients){
            clientRepository.save(client);
        }




        // Cargos
        Cargo[] cargos = {
            new Cargo()
                .setHeight(100.0)
                .setWidth(203.0)
                .setWeight(120.0),
            new Cargo()
                .setHeight(100.0)
                .setWidth(203.0)
                .setWeight(120.0),
        };


        // Addresses
        Address[] addresses = {
            new Address()
                .setCity("Goiânia")
                .setState("Goiás")
                .setComplement("Qd 0 Lt 0")
                .setCountry("Brasil")
                .setZipCode("74000000")
                .setNumber(77),
            new Address()
                .setCity("Goiânia")
                .setState("Goiás")
                .setComplement("Qd 0 Lt 0")
                .setCountry("Brasil")
                .setZipCode("74000000")
                .setNumber(77),
        };


        // Seed Deliveries
        Iterable<Vehicle> iterableVehicles = vehicleRepository.findAll();
        ArrayList<Vehicle> existingVehicles = new ArrayList<>();

        for (Vehicle vehicle: iterableVehicles) {
            existingVehicles.add(vehicle);
        }

        Iterable<Client> iterableClients = clientRepository.findAll();
        ArrayList<Client> existingClients = new ArrayList<>();

        for (Client client: iterableClients) {
            existingClients.add(client);
        }

        Delivery[] deliveries = {
            new Delivery()
                .setCreated(LocalDate.now())
                .setConclusion(LocalDate.now())
                .setExpected(LocalDate.now())
                .setSubTotal(new BigDecimal(780))
                .setTotal(new BigDecimal(1300))
                .setCargo(cargos[0])
                .setAddress(addresses[0])
                .setVehicle(existingVehicles.get(0))
                .setClient(existingClients.get(0)),
            new Delivery()
                .setCreated(LocalDate.now())
                .setConclusion(LocalDate.now())
                .setExpected(LocalDate.now())
                .setSubTotal(new BigDecimal(820))
                .setTotal(new BigDecimal(1900))
                .setCargo(cargos[1])
                .setAddress(addresses[1])
                .setVehicle(existingVehicles.get(0))
                .setClient(existingClients.get(1)),
        };

        for(Delivery delivery : deliveries) {
            deliveryRepository.save(delivery);
        }

        return null;
    }
}
