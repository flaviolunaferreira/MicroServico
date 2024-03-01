package the.coyote.clientes.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import the.coyote.clientes.entities.Clientes;

@Repository
public interface ClientesRepository extends PagingAndSortingRepository<Clientes, Long> {
        
}
