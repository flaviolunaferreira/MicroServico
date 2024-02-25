package the.coyote.clientes.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import the.coyote.core.clientes.dtos.ClientesResponseDTO;
import the.coyote.core.clientes.repositories.ClientesRepository;
import the.coyote.clientes.service.ClientesService;
import the.coyote.core.clientes.entities.clientes.Clientes;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClientesServiceImpl implements ClientesService {

    private final ClientesRepository clientesRepository;

    @Override
    public List<ClientesResponseDTO> getAllClientes(int page, int size) {

        PageRequest pagina = PageRequest.of(page, size);

        Page<Clientes> lista = clientesRepository.findAll(pagina);

        return lista.stream().map(ClientesResponseDTO::new).collect(Collectors.toList());
    }
    
}
