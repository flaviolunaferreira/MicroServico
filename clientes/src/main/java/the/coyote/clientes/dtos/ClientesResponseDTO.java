package the.coyote.clientes.dtos;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;
import the.coyote.clientes.entities.Clientes;
import the.coyote.clientes.enumaradores.EstadoCivil;
import the.coyote.clientes.enumaradores.Sexo;
import the.coyote.clientes.enumaradores.TipoDePessoa;

@Data
@NoArgsConstructor
public class ClientesResponseDTO {

    private Long id;
    private TipoDePessoa tipoDePessoa;
    private String nomeRazao;
    private String nome;
    private String conjuge;
    private Boolean preCadastroCliente;
    private Boolean atualizaPessoa;
    private Sexo sexo;
    private EstadoCivil estadoCivil;
    private LocalDate dataNascimento;
    private Integer idLoja;
    private Boolean contribuinteDoIcms;
    private Integer indPrestServConstCivil;
    private Boolean regraFiscalDeSaidaAtivada;

    public ClientesResponseDTO(Clientes cli) {
        this.setId(cli.getId());
        this.setTipoDePessoa(TipoDePessoa.valueOf(getTipoDePessoa().getDescricao()));
        this.setNomeRazao(cli.getNomeRazao());
        this.setNome(cli.getNome());
        this.setConjuge(cli.getConjuge());
        this.setPreCadastroCliente(cli.getPreCadastroCliente());
        this.setAtualizaPessoa(cli.getAtualizaPessoa());
        this.setSexo(Sexo.valueOf(cli.getSexo().getDescricao()));
        this.setEstadoCivil(cli.getEstadoCivil());
        this.setDataNascimento(cli.getDataNascimento());
        this.setIdLoja(cli.getIdLoja());
        this.setContribuinteDoIcms(cli.getContribuinteDoIcms());
        this.setIndPrestServConstCivil(cli.getIndPrestServConstCivil());
        this.setRegraFiscalDeSaidaAtivada(cli.getRegraFiscalDeSaidaAtivada());
    }
   
}
