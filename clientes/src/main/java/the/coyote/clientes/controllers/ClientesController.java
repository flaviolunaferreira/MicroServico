package the.coyote.clientes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;
import the.coyote.clientes.service.ClientesService;
import the.coyote.clientes.dtos.ClientesRequestDTO;
import the.coyote.clientes.dtos.ClientesResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/clientes")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClientesController {

    private final ClientesService clientesService;

    @GetMapping()
    public ResponseEntity<List<ClientesResponseDTO>> getAll(@RequestParam int page,@RequestParam int size) {
        try {
            return ResponseEntity.ok().body(clientesService.getAllClientes(page, size));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/id/{id}")
    public ResponseEntity<ClientesResponseDTO> getOne(@PathVariable Long id) {
        try {
            return ResponseEntity.ok().body(clientesService.getOne(id));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
      
    @PostMapping()
    public ResponseEntity<ClientesResponseDTO> create(@RequestBody ClientesRequestDTO clientesRequestDTO) {
        try {
            return ResponseEntity.ok().body(clientesService.create(clientesRequestDTO));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PutMapping("/id/{id}")
    public ResponseEntity<?> update(@RequestBody ClientesRequestDTO clientesRequestDTO, @PathVariable Long id) {
        try {
            return ResponseEntity.ok().body(clientesService.update(clientesRequestDTO, id));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> destroy(@PathVariable Long id) {
        try {
            clientesService.destroy(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
