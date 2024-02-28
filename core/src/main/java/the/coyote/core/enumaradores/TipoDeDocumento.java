package the.coyote.core.enumaradores;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum TipoDeDocumento {
    
    CPF,
    RG,
    CTPS;

    public List<String> getCampos() {
        switch (this) {
            case CPF:
                return (List<String>) Arrays.asList("numero");
            case RG:
                return Arrays.asList("numero", "serie", "orgaoEmissor", "dataCadastro");
            case CTPS:
                return Arrays.asList("numero", "serie", "orgaoEmissor", "dataCadastro", "numeroPis", "cargo", "salario");
            default:
                return Collections.emptyList();
        }
    }

    public Map<String, Class<?>> getTipos() {
        switch (this) {
            case CPF:
                return Collections.singletonMap("numero", String.class);
            case RG:
                Map<String, Class<?>> tiposRG = new HashMap<>();
                tiposRG.put("numero", String.class);
                tiposRG.put("serie", String.class);
                tiposRG.put("orgaoEmissor", String.class);
                tiposRG.put("dataCadastro", LocalDate.class);
                return tiposRG;
            case CTPS:
                Map<String, Class<?>> tiposCTPS = new HashMap<>();
                tiposCTPS.put("numero", String.class);
                tiposCTPS.put("serie", String.class);
                tiposCTPS.put("orgaoEmissor", String.class);
                tiposCTPS.put("dataCadastro", LocalDate.class);
                tiposCTPS.put("numeroPis", String.class);
                tiposCTPS.put("cargo", String.class);
                tiposCTPS.put("salario", BigDecimal.class);
                return tiposCTPS;
            default:
                return Collections.emptyMap();
        }
    }
}
