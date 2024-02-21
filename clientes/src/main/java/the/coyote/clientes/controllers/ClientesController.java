package the.coyote.clientes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;
import the.coyote.clientes.dto.clientes.ClientesResponseDTO;
import the.coyote.clientes.service.ClientesService;

@RestController
@RequestMapping("/api/v1/clientes")
@AllArgsConstructor
public class ClientesController {
    
    @Autowired
    private final ClientesService clientesService;

    
    @GetMapping()
    public ResponseEntity<List<ClientesResponseDTO>> getAllClientes(@RequestParam int page, int size) {
        try {
            return ResponseEntity.ok().body(clientesService.getAllClientes(page, size));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    // @GetMapping("/{id}")
    // public ResponseEntity<?> getOne(@PathVariable Integer id) {
    //     try {
    //         //TODO Implement Your Logic To Get Data From Service Layer Or Directly From Repository Layer
    //         return new ResponseEntity<>("GetOne Result", HttpStatus.OK);
    //     } catch (Exception e) {
    //         return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    //     }
    // }
    
    // @PostMapping()
    // public ResponseEntity<?> create(@RequestBody Dto dto) {
    //     try {
    //         //TODO Implement Your Logic To Save Data And Return Result Through ResponseEntity
    //         return new ResponseEntity<>("Create Result", HttpStatus.OK);
    //     } catch (Exception e) {
    //         return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    //     }
    // }
    
    // @PutMapping()
    // public ResponseEntity<?> update(@RequestBody Dto dto) {
    //     try {
    //         //TODO Implement Your Logic To Update Data And Return Result Through ResponseEntity
    //         return new ResponseEntity<>("Update Result", HttpStatus.OK);
    //     } catch (Exception e) {
    //         return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    //     }
    // }
    
    // @DeleteMapping("/{id}")
    // public ResponseEntity<?> destroy(@PathVariable Integer id) {
    //     try {
    //         //TODO Implement Your Logic To Destroy Data And Return Result Through ResponseEntity
    //         return new ResponseEntity<>("Destroy Result", HttpStatus.OK);
    //     } catch (Exception e) {
    //         return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    //     }
    // }
}
