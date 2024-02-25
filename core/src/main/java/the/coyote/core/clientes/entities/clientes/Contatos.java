package the.coyote.core.clientes.entities.clientes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import the.coyote.core.enumaradores.TipoDeContato;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Contatos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContato;

    private TipoDeContato tipoContato;
    
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Clientes cliente;
}

