package the.coyote.core.funcionarios.entities;

import java.util.ArrayList;
import java.util.Date;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import the.coyote.core.BasicEntity;
import the.coyote.core.compartilhados.ContasBancarias;
import the.coyote.core.compartilhados.Contatos;
import the.coyote.core.compartilhados.Enderecos;
import the.coyote.core.enumaradores.Escolaridade;
import the.coyote.core.enumaradores.EstadosBrasileiros;
import the.coyote.core.enumaradores.TipoDePessoa;
import the.coyote.core.enumaradores.TipoSanguineo;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Funcionarios extends BasicEntity{
    
    private TipoDePessoa tipoDePessoa;
    private String nomeRazao;
    private String nome;
    private String sexo;
    private String estadoCivil;
    private String conjuge;
    private Date dataNascimento;
    private boolean convenioMedico;
    private boolean valeTransporte;
    private String nacionalidade;
    private String naturalidade;
    private EstadosBrasileiros ufNaturalidade;
    private Escolaridade grauInstrucao;
    private String nomePai;
    private String nomeMae;
    private String cnpjSindicato;
    private boolean status;
    private String departamentoSetor;
    private boolean usaValeCompra;
    private int limiteValeCompra;
    private ArrayList<Contatos> contatos;
    private ArrayList<Enderecos> enderecos;
    private TipoSanguineo tipoSanguineo;
    private ArrayList<ContasBancarias> contasBancarias;
    private ArrayList<VinculosEmpregaticio> vinculosEmpregaticios;

}