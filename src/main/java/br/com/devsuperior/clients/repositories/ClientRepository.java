package br.com.devsuperior.clients.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.devsuperior.clients.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
