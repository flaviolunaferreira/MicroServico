package the.coyote.clientes.repositories;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import the.coyote.clientes.entities.Clientes;

@Repository
public interface ClientesRepository extends PagingAndSortingRepository<Clientes, Integer> {

    Page<Clientes> findAll(Pageable pageable);
        
}
