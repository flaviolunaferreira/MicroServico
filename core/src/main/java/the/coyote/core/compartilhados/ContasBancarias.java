package the.coyote.core.compartilhados;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode
public class ContasBancarias{

    public int codigoBanco;
    public int codigoAgencia;
    public String tipoContaBancaria;
    public int numeroConta;
    public String digitoConta;
    public boolean ativa;
    public int codigoContaContabil;
    public boolean contaPadrao;
    public boolean contabilizacaoPelaDataDeConciliacao;
    public boolean usaPix;
    public String cpfCnpjTitular;

}
