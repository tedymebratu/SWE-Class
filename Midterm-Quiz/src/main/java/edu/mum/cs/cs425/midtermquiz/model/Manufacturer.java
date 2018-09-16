package edu.mum.cs.cs425.midtermquiz.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
    @Table(name = "Manufacturers")
    public class Manufacturer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long manufacturerId;

        public String name;
        public String plantAddress;
        private List<Vehicle> vehicles=new ArrayList<>();


        public Manufacturer() {

        }

        public Manufacturer(String name, String plantAddress) {
            this.name = name;
            this.plantAddress = plantAddress;
        }

        public Long getManufacturerId() {
            return manufacturerId;
        }

        public void setManufacturerId(Long manufacturerId) {
            this.manufacturerId = manufacturerId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPlantAddress() {
            return plantAddress;
        }

        public void setPlantAddress(String plantAddress) {
            this.plantAddress = plantAddress;
        }

        public void addVehicles(Vehicle vehicle){
            vehicles.add(vehicle);
        }public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }


    }
