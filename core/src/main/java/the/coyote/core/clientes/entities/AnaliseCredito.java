package the.coyote.core.clientes.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class AnaliseCredito{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAnalise;

    private LocalDate dataAnalise;

    private BigDecimal rendaBruta;

    private BigDecimal totalCredito;

    @OneToMany(mappedBy = "analiseCredito", cascade = CascadeType.ALL)
    private List<Limites> limites;

    @OneToOne
    @JoinColumn(name = "idCliente")
    private Clientes cliente;

}
