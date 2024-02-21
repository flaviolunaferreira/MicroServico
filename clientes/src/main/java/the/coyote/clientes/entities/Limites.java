package the.coyote.clientes.entities;

import java.math.BigDecimal;

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
import the.coyote.clientes.enumeradores.StatusCliente;
import the.coyote.clientes.enumeradores.TipoDeLimite;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Limites {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLimite;

    private TipoDeLimite tipoLimiteSaldo;

    private BigDecimal limite;

    private StatusCliente status;

    private Boolean podeProtestar;

    private String observacao;

    @ManyToOne
    @JoinColumn(name = "idAnalise")
    private AnaliseCredito analiseCredito;

}
