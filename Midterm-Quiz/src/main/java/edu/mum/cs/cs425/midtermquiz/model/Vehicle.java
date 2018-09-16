package edu.mum.cs.cs425.midtermquiz.model;

import sun.util.calendar.BaseCalendar;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(name = "Vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;

    private long vehicleVINNumber;
    private String brandName;
    private double retailPrice;
    private LocalDate dateMfd;

    @OneToMany(mappedBy = "manufacturer", cascade = CascadeType.PERSIST)
    private Manufacturer manufacturer;

    public Vehicle() {
    }

    public Vehicle(long vehicleVINNumber, String brandName, double retailPrice, LocalDate dateMfd,Manufacturer manufacturer) {
        this.vehicleVINNumber = vehicleVINNumber;
        this.brandName = brandName;
        this.retailPrice = retailPrice;
        this.dateMfd = dateMfd;
        this.manufacturer=manufacturer;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public long getVehicleVINNumber() {
        return vehicleVINNumber;
    }

    public void setVehicleVINNumber(long vehicleVINNumber) {
        this.vehicleVINNumber = vehicleVINNumber;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public LocalDate getDateMfd() {
        return dateMfd;
    }

    public void setDateMfd(LocalDate dateMfd) {
        this.dateMfd = dateMfd;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
