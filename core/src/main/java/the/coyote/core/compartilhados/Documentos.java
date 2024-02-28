package the.coyote.core.compartilhados;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import the.coyote.core.BasicEntity;
import the.coyote.core.enumaradores.TipoDeDocumento;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Documentos extends BasicEntity{
    
    @Enumerated(EnumType.STRING)
    private TipoDeDocumento tipo;

    private String campo;
    private String valor;

}
