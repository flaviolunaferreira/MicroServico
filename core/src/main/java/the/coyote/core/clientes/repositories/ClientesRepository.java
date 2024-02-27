package the.coyote.core.clientes.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import the.coyote.core.clientes.entities.Clientes;

@Repository
public interface ClientesRepository extends PagingAndSortingRepository<Clientes, Integer> {
        
}
