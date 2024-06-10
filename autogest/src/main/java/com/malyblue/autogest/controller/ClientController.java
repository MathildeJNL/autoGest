package com.malyblue.autogest.controller;


import com.malyblue.autogest.entity.Client;
import com.malyblue.autogest.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Indiquer que la classe est un contrôleur REST
@RestController
//Spécifie le chemin de base pour les routes dans ce contrôleur
@RequestMapping("/clients")
public class ClientController {
    // Injection de dépendance du service Client
    private final ClientService clientService;

    // Constructeur pour l'injection de dépendance
    @Autowired
    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @PostMapping
    // @RequestBody indique que le corps de la requête HTTP sera utilisé pour remplir l'objet Client
    public Client createClient(@RequestBody Client client){
        return clientService.createClient(client);
    }

    @GetMapping("/{id}")
    // @PathVariable indique que la valeur de l'ID sera prise à partir du chemin de la requête HTTP
    public Client getClient(@PathVariable Integer id){
        return clientService.getClient(id);
    }

    @GetMapping
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }

    @PutMapping
    public Client updateClient(@RequestBody Client client){
        return clientService.updateClient(client);
    }

    @DeleteMapping("/{id}")
    // @PathVariable indique que la valeur de l'ID sera prise à partir du chemin de la requête HTTP
    public void deleteClient(@PathVariable Integer id) {
        clientService.deleteClient(id);
    }

}
