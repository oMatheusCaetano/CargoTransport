package br.com.unialfa.cargotransp.CagoTransp;

import br.com.unialfa.cargotransp.CagoTransp.Vehicle.domain.Vehicle;
import br.com.unialfa.cargotransp.CagoTransp.Vehicle.domain.VehicleStatus;
import br.com.unialfa.cargotransp.CagoTransp.Vehicle.repository.VehicleRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CagoTranspApplication {

    @Autowired
    private VehicleRepository vehicleRepository;

    public static void main(String[] args) {
        SpringApplication.run(CagoTranspApplication.class, args);
    }

    @Bean
    InitializingBean sendDatabase() {
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

        return null;
    }
}
