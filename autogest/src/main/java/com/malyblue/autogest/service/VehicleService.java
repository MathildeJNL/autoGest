package com.malyblue.autogest.service;

import com.malyblue.autogest.entity.Vehicle;
import com.malyblue.autogest.repository.IVehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    private final IVehicleRepository iVehicleRepository;

    @Autowired
    public VehicleService(IVehicleRepository iVehicleRepository){
        this.iVehicleRepository = iVehicleRepository;
    }

    // Créer un nouveau vehicle
    public Vehicle createVehicle(Vehicle vehicle) {
        return iVehicleRepository.save(vehicle);
    }

    // Obtenir un vehicle par ID
    public Vehicle getVehicle(Integer id) {
        return iVehicleRepository.findById(id).orElse(null);
    }

    // Obtenir tous les vehicle
    public List<Vehicle> getAllVehicles() {
        return iVehicleRepository.findAll();
    }

    // Mettre à jour un vehicle
    public Vehicle updateVehicle(Vehicle vehicle) {
        return iVehicleRepository.save(vehicle);
    }

    // Supprimer un vehicle
    public void deleteVehicle(Integer id) {
        iVehicleRepository.deleteById(id);
    }

}
