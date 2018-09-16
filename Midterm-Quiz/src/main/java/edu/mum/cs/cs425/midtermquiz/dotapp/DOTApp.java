package edu.mum.cs.cs425.midtermquiz.dotapp;


import edu.mum.cs.cs425.midtermquiz.model.Manufacturer;
import edu.mum.cs.cs425.midtermquiz.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DOTApp  implements CommandLineRunner {

    @Autowired
    private LocalContainerEntityManagerFactoryBean factory;

    public static void main(String[] args) {
        SpringApplication.run(DOTApp.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println( "Starting DOTApp..." );
        Manufacturer m1 = new Manufacturer("Ford Motors, Inc.","100 North Central Ave., Detroit, Michigan");
        Vehicle v1 = new Vehicle(1001,"Ford Explorer",31000.00,LocalDate.of(2018,6,30),m1);
        Vehicle v2 = new Vehicle(1002,"Ford Escap",22995.00,LocalDate.of(2018,4,15),m1);

        List<Vehicle> vehicles = Arrays.asList(new Vehicle[] { v1, v2 });
        m1.setVehicles(vehicles);
        saveManufacturerAndVehicles(m1);

        //saveManufacturerAndVehicles(m1);

        System.out.println( "Finishing DOTApp..." );
        System.out.println(m1);
    }

    private void saveManufacturerAndVehicles(Manufacturer manufacturer) {
        if (manufacturer != null) {
            EntityManager em = factory.getObject().createEntityManager();
            em.getTransaction().begin();
            em.persist(manufacturer);
            em.getTransaction().commit();
            em.close();
        }
    }
}
