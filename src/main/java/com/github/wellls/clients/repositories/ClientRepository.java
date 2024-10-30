package com.github.wellls.clients.repositories;

import com.github.wellls.clients.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
