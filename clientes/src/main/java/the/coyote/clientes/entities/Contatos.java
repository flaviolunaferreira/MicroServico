package the.coyote.clientes.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import the.coyote.clientes.enumaradores.TipoDeContato;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Contatos extends BasicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TipoDeContato tipoContato;
    
    private String descricao;

    @ManyToOne
    private Clientes cliente;
}

