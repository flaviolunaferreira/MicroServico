package the.coyote.clientes.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import the.coyote.clientes.enumaradores.TipoDeEndereco;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Enderecos extends BasicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TipoDeEndereco tipoDeEndereco;

    private String rua;

    private String numero;

    private String cep;

    private String cidade;

    private String uf;

    private String bairro;

    private String complemento;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Clientes cliente;

}
