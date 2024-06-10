package com.malyblue.autogest.service;

import com.malyblue.autogest.entity.Client;
import com.malyblue.autogest.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final IClientRepository iClientRepository;

    @Autowired
    public ClientService(IClientRepository iClientRepository){
        this.iClientRepository = iClientRepository;
    }

    // Créer un nouveau client
    public Client createClient(Client client) {
        return iClientRepository.save(client);
    }

    // Obtenir un client par ID
    public Client getClient(Integer id) {
        return iClientRepository.findById(id).orElse(null);
    }

    // Obtenir tous les clients
    public List<Client> getAllClients() {
        return iClientRepository.findAll();
    }

    // Mettre à jour un client
    public Client updateClient(Client client) {
        return iClientRepository.save(client);
    }

    // Supprimer un client
    public void deleteClient(Integer id) {
        iClientRepository.deleteById(id);
    }
}
