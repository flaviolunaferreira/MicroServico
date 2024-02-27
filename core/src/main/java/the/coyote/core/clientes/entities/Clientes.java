package the.coyote.core.clientes.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import the.coyote.core.BasicEntity;
import the.coyote.core.enumaradores.EstadoCivil;
import the.coyote.core.enumaradores.Sexo;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Clientes extends BasicEntity {

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

}