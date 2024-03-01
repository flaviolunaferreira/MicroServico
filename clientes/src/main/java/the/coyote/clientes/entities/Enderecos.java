package the.coyote.core.compartilhados;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import the.coyote.core.BasicEntity;
import the.coyote.clientes.entities.Clientes;
import the.coyote.core.enumaradores.TipoDeEndereco;



@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Enderecos extends BasicEntity {

    private TipoDeEndereco tipoDeEndereco;

    private String rua;

    private String numero;

    private String cep;

    private String cidade;

    private String uf;

    private String bairro;

    private String complemento;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Clientes cliente;

}
