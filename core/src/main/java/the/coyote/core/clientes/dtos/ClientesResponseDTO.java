package the.coyote.core.clientes.dtos;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;
import the.coyote.core.clientes.entities.Clientes;
import the.coyote.core.enumaradores.Sexo;

@Data
@NoArgsConstructor
public class ClientesResponseDTO {

    private Long id;

    private String nomeRazao;

    private String nome;

    private Sexo sexo;

    private LocalDate dataNascimento;

    public ClientesResponseDTO(Clientes cli) {
        this.setId(cli.getId());
        this.setNome(cli.getNome());
        this.setNomeRazao(cli.getNomeRazao());
        this.setSexo(cli.getSexo());
        this.setDataNascimento(cli.getDataNascimento());

    }
   
}
