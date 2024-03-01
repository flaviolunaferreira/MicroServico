package the.coyote.core.compartilhados;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import the.coyote.core.BasicEntity;
import the.coyote.clientes.entities.Clientes;
import the.coyote.core.enumaradores.TipoDeContato;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Contatos extends BasicEntity {

    private TipoDeContato tipoContato;
    
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Clientes cliente;
}

