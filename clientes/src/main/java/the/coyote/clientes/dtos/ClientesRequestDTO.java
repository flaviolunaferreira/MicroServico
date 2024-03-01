package the.coyote.core.clientes.dtos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import the.coyote.core.compartilhados.Contatos;
import the.coyote.core.compartilhados.Documentos;
import the.coyote.core.compartilhados.Enderecos;
import the.coyote.core.enumaradores.EstadoCivil;
import the.coyote.core.enumaradores.Sexo;
import the.coyote.core.enumaradores.TipoDePessoa;

@Data
@NoArgsConstructor
public class ClientesRequestDTO {
    
   @Column(nullable = false)
    private TipoDePessoa tipoDePessoa;

    @Column(nullable = false)
    private String nomeRazao;

    @Column(nullable = false)
    private String nome;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Contatos> contatos = new ArrayList<>();

    private String conjuge;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Enderecos> enderecos;

    private Boolean preCadastroCliente;

    private Boolean atualizaPessoa;

    private Sexo sexo;

    private EstadoCivil estadoCivil;

    private LocalDate dataNascimento;

    private Integer idLoja;

    private Boolean contribuinteDoIcms;

    private Integer indPrestServConstCivil;

    private Boolean regraFiscalDeSaidaAtivada;

    private List<Documentos> documentos;

}
