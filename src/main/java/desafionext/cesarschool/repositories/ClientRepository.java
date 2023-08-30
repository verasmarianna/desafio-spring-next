package desafionext.cesarschool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import desafionext.cesarschool.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
    
}
