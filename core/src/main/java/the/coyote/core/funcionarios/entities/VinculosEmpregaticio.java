package the.coyote.core.funcionarios.entities;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import the.coyote.core.BasicEntity;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class VinculosEmpregaticio extends BasicEntity {
    
    public int codigoIntegracaoFolha;
    public int lojaRegistro;
    public int lojaEfetiva;
    public String dataAdmissao;
    public String dataDemissao;
    public String motivoDemissao;
    public String cnpjLojaRegistro;
    public String cnpjLojaEfetiva;
    
}
