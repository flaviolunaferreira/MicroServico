package the.coyote.clientes.entities;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import the.coyote.clientes.enumaradores.StatusCliente;
import the.coyote.clientes.enumaradores.TipoDeLimite;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Limites extends BasicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TipoDeLimite tipoLimiteSaldo;

    private BigDecimal limite;

    private StatusCliente status;

    private Boolean podeProtestar;

    private String observacao;

    @ManyToOne
    private AnaliseCredito analiseCredito;

}
