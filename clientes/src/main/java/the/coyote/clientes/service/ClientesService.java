package the.coyote.clientes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import the.coyote.clientes.dto.clientes.ClientesResponseDTO;

@Service
public interface ClientesService {

    List<ClientesResponseDTO> getAllClientes(int page, int size);

}
