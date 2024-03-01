package the.coyote.clientes.service;

import java.util.List;

import org.springframework.stereotype.Service;
import the.coyote.clientes.dtos.ClientesRequestDTO;
import the.coyote.clientes.dtos.ClientesResponseDTO;


@Service
public interface ClientesService {

    List<ClientesResponseDTO> getAllClientes(int page, int size);

    ClientesResponseDTO getOne(Long id);

    ClientesResponseDTO create(ClientesRequestDTO clientesRequestDTO);

    ClientesResponseDTO update(ClientesRequestDTO clientesRequestDTO, Long id);

    void destroy(Long id);

}
