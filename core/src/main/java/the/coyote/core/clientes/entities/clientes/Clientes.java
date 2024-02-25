package the.coyote.core.clientes.entities.clientes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import the.coyote.core.enumaradores.EstadoCivil;
import the.coyote.core.enumaradores.Sexo;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nomeRazao;

    private String cpfCnpj;

    private String nome;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Contatos> contatos = new ArrayList<>();

    private String inscricaoEstadual;

    private String conjuge;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Enderecos> enderecos;

    private Boolean preCadastroCliente;

    private LocalDateTime dataCadastro;

    private Boolean atualizaPessoa;

    private Sexo sexo;

    private EstadoCivil estadoCivil;

    private LocalDate dataNascimento;

    private Integer idLoja;

    private Boolean contribuinteDoIcms;

    private Integer indPrestServConstCivil;

    private Boolean regraFiscalDeSaidaAtivada;

    private Integer idResponsavelCadastro;

    private LocalDateTime dataDeCadastro;

    private Integer idResponsávelUltimaAlteracao;

    private LocalDateTime dataUltimaAlteracao;

}