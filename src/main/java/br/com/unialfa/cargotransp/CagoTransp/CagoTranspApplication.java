package br.com.unialfa.cargotransp.CagoTransp;

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

@SpringBootApplication
public class CagoTranspApplication {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private DeliveryRepository deliveryRepository;

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
                .setStatus(VehicleStatus.PARKED),
            new Vehicle()
                .setBrand("Volvo")
                .setModel("FH 16")
                .setNumberOfAxles(6)
                .setCapacity(10000.0)
                .setStatus(VehicleStatus.PARKED),
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
                .setStatus(VehicleStatus.MAINTENANCE),
            new Vehicle()
                .setBrand("Scania")
                .setModel("Scania Truck")
                .setNumberOfAxles(8)
                .setCapacity(12000.0)
                .setStatus(VehicleStatus.WORKING),
        };

        for(Vehicle truck : vehicles){
            vehicleRepository.save(truck);
        }



        // Seed Deliveries
        Delivery[] deliveries = {
            new Delivery()
                .setCreated(LocalDate.now())
                .setConclusion(LocalDate.now())
                .setExpected(LocalDate.now())
                .setSubTotal(new BigDecimal(780))
                .setTotal(new BigDecimal(1300)),
            new Delivery()
                .setCreated(LocalDate.now())
                .setConclusion(LocalDate.now())
                .setExpected(LocalDate.now())
                .setSubTotal(new BigDecimal(820))
                .setTotal(new BigDecimal(1900)),
        };

        for(Delivery delivery : deliveries){
            deliveryRepository.save(delivery);
        }

        return null;
    }
}
