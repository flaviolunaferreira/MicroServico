package the.coyote.clientes.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import the.coyote.clientes.dtos.ClientesRequestDTO;
import the.coyote.clientes.dtos.ClientesResponseDTO;
import the.coyote.clientes.entities.Clientes;
import the.coyote.clientes.repositories.ClientesRepository;
import the.coyote.clientes.service.ClientesService;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClientesServiceImpl implements ClientesService {

    private final ClientesRepository clientesRepository;

    @Override
    public List<ClientesResponseDTO> getAllClientes(int page, int size) {

        if(size <= 10 || size > 100) {
            size = 100;
        }

        PageRequest pagina = PageRequest.of(page, size);

        Page<Clientes> lista = clientesRepository.findAll(pagina);

        return lista.stream().map(ClientesResponseDTO::new).collect(Collectors.toList());
    }

    @Override
    public ClientesResponseDTO getOne(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'getOne'");
    }

    @Override
    public ClientesResponseDTO create(ClientesRequestDTO clientesRequestDTO) {
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public ClientesResponseDTO update(ClientesRequestDTO clientesRequestDTO, Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void destroy(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'destroy'");
    }
    
}
