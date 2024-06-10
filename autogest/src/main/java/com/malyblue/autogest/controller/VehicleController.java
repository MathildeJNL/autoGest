package com.malyblue.autogest.controller;

import com.malyblue.autogest.entity.Client;
import com.malyblue.autogest.entity.Vehicle;
import com.malyblue.autogest.service.ClientService;
import com.malyblue.autogest.service.VehicleService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Indiquer que la classe est un contrôleur REST
@RestController
//Spécifie le chemin de base pour les routes dans ce contrôleur
@RequestMapping("/vehicle")
public class VehicleController {
    // Injection de dépendance du service Client
    private final VehicleService vehicleService;

    // Ajoutez le service Client
    private final ClientService clientService;

    // Constructeur pour l'injection de dépendance
    @Autowired
    private VehicleController(VehicleService vehicleService, ClientService clientService){
        this.vehicleService = vehicleService;
        this.clientService = clientService; // Initialise le service Client
    }

    @PostMapping("/{clientId}")
    public Vehicle createVehicle(@PathVariable Integer clientId, @RequestBody Vehicle vehicle){
        Client client = clientService.getClient(clientId); // Obtient le client
        vehicle.setClient(client); // Associe le client au véhicule
        return vehicleService.createVehicle(vehicle);
    }

    @GetMapping("/{id}")
    // @PathVariable indique que la valeur de l'ID sera prise à partir du chemin de la requête HTTP
    public Vehicle getVehicle(@PathVariable Integer id){
        return vehicleService.getVehicle(id);
    }

    @GetMapping
    public List<Vehicle> getAllVehicles(){
        return vehicleService.getAllVehicles();
    }

    @PutMapping("/{clientId}")
    public Vehicle updateVehicle(@PathVariable Integer clientId, @RequestBody Vehicle vehicle){
        Client client = clientService.getClient(clientId); // Obtenir le client
        vehicle.setClient(client); // Associer le client au véhicule
        return vehicleService.updateVehicle(vehicle);
    }

    @DeleteMapping("/{id}")
    // @PathVariable indique que la valeur de l'ID sera prise à partir du chemin de la requête HTTP
    public void deleteVehicle(@PathVariable Integer id) {
        vehicleService.deleteVehicle(id);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<String> handleEntityNotFoundException(EntityNotFoundException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

}
