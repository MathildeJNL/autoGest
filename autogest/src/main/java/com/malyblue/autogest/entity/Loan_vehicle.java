package com.malyblue.autogest.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Loan_vehicle")
public class Loan_vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "license_plate")
    private String license_plate;

    @Column(name = "kilometers")
    private int kilometers;

    public Loan_vehicle(int id, String brand, String license_plate, int kilometers) {
        this.id = id;
        this.brand = brand;
        this.license_plate = license_plate;
        this.kilometers = kilometers;
    }

    public Loan_vehicle() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicense_plate() {
        return license_plate;
    }

    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public String toString() {
        return "Loan_vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", license_plate='" + license_plate + '\'' +
                ", kilometers=" + kilometers +
                '}';
    }
}
