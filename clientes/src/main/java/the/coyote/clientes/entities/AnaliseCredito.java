package the.coyote.clientes.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
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
    private Clientes cliente;

}
