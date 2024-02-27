package the.coyote.core.clientes.entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import the.coyote.core.BasicEntity;
import the.coyote.core.enumaradores.StatusCliente;
import the.coyote.core.enumaradores.TipoDeLimite;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Limites extends BasicEntity {

    private TipoDeLimite tipoLimiteSaldo;

    private BigDecimal limite;

    private StatusCliente status;

    private Boolean podeProtestar;

    private String observacao;

    @ManyToOne
    @JoinColumn(name = "idAnalise")
    private AnaliseCredito analiseCredito;

}
