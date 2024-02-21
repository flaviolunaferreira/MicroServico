package the.coyote.clientes.dto.clientes;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import the.coyote.clientes.entities.Clientes;
import the.coyote.clientes.enumeradores.Sexo;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientesResponseDTO {

    private Integer id;

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
