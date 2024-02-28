package the.coyote.core.fornecedores.entities;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import the.coyote.core.BasicEntity;
import the.coyote.core.compartilhados.Contatos;
import the.coyote.core.compartilhados.Enderecos;
import the.coyote.core.enumaradores.EstadoCivil;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Fornecedores extends BasicEntity{
    
    private String nomeRazao;
    private String nome;
    private ArrayList<Contatos> contatos;
    private EstadoCivil estadoCivil;
    private String conjuge;
    private ArrayList<Enderecos> enderecos;
    private boolean atualizaPessoa;

}
