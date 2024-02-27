package the.coyote.core.clientes.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import the.coyote.core.clientes.entities.Clientes;
import the.coyote.core.enumaradores.Sexo;

@Data
@NoArgsConstructor
public class ClientesResponseDTO {

    private Long id;

    private String nomeRazao;

    private String cpfCnpj;

    private String nome;

    private String inscricaoEstadual;

    private Sexo sexo;

    private LocalDate dataNascimento;

    public ClientesResponseDTO(Clientes cli) {
        this.setId(cli.getId());
        this.setNome(cli.getNome());
        this.setNomeRazao(cli.getNomeRazao());
        this.setCpfCnpj(cli.getCpfCnpj());
        this.setInscricaoEstadual(cli.getInscricaoEstadual());
        this.setSexo(cli.getSexo());
        this.setDataNascimento(cli.getDataNascimento());

    }
   
}
