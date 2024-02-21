package the.coyote.clientes.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import the.coyote.clientes.dto.clientes.ClientesResponseDTO;
import the.coyote.clientes.entities.Clientes;
import the.coyote.clientes.repositories.ClientesRepository;
import the.coyote.clientes.service.ClientesService;

@Service
public class ClientesServiceImpl implements ClientesService {

    private final ClientesRepository clientesRepository;

    public ClientesServiceImpl(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    @Override
    public List<ClientesResponseDTO> getAllClientes(int page, int size) {

        PageRequest pagina = PageRequest.of(page, size);

        Page<Clientes> lista = clientesRepository.findAll(pagina);

        return lista.stream().map(ClientesResponseDTO::new).collect(Collectors.toList());
    }
    
}
