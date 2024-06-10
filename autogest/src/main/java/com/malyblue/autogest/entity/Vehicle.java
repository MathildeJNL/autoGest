package com.malyblue.autogest.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "license_plate")
    private String license_plate;

    @Column(name = "kilometers")
    private String kilometers;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    public Vehicle(int id, String brand, String license_plate, String kilometers, Client client) {
        this.id = id;
        this.brand = brand;
        this.license_plate = license_plate;
        this.kilometers = kilometers;
        this.client = client;
    }

    public Vehicle() {

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

    public String getKilometers() {
        return kilometers;
    }

    public void setKilometers(String kilometers) {
        this.kilometers = kilometers;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", license_plate='" + license_plate + '\'' +
                ", kilometers='" + kilometers + '\'' +
                ", client=" + client +
                '}';
    }
}
