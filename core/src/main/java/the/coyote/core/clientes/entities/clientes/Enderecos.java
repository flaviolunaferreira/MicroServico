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
import the.coyote.core.enumaradores.TipoDeEndereco;


@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Enderecos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEndereco;

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
