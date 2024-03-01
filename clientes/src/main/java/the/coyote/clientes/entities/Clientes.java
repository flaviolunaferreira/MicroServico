package the.coyote.clientes.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import the.coyote.clientes.enumaradores.EstadoCivil;
import the.coyote.clientes.enumaradores.Sexo;
import the.coyote.clientes.enumaradores.TipoDePessoa;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Clientes extends BasicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Documentos> documentos;

}