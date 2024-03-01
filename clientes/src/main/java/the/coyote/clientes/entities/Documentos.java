package the.coyote.clientes.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import the.coyote.clientes.enumaradores.TipoDeDocumento;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Documentos extends BasicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TipoDeDocumento tipo;
    private String campo;
    private String valor;

    @ManyToOne
    private Clientes cliente;


}
