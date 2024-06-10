package com.malyblue.autogest.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Planning")
public class Planning {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "registration_date")
    private Date registration_date;

    @Column(name = "pickup_date")
    private Date pickup_date;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "loan_vehicle", nullable = true)
    private Loan_vehicle loan_vehicle;

    public Planning(int id, Date registration_date, Date pickup_date, Vehicle vehicle, Loan_vehicle loan_vehicle) {
        this.id = id;
        this.registration_date = registration_date;
        this.pickup_date = pickup_date;
        this.vehicle = vehicle;
        this.loan_vehicle = loan_vehicle;
    }

    public Planning() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(Date registration_date) {
        this.registration_date = registration_date;
    }

    public Date getPickup_date() {
        return pickup_date;
    }

    public void setPickup_date(Date pickup_date) {
        this.pickup_date = pickup_date;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Loan_vehicle getLoan_vehicle() {
        return loan_vehicle;
    }

    public void setLoan_vehicle(Loan_vehicle loan_vehicle) {
        this.loan_vehicle = loan_vehicle;
    }

    @Override
    public String toString() {
        return "Planning{" +
                "id=" + id +
                ", registration_date=" + registration_date +
                ", pickup_date=" + pickup_date +
                ", vehicle=" + vehicle +
                ", loan_vehicle=" + loan_vehicle +
                '}';
    }
}
