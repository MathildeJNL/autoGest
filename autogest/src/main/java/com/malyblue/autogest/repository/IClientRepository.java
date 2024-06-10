package com.malyblue.autogest.repository;

import com.malyblue.autogest.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends JpaRepository<Client, Integer> {
}
