package the.coyote.clientes.enumaradores;

public enum EstadoCivil {
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    SEPARADO("Separado"),
    VIUVO("Viúvo"),
    DIVORCIADO("Divorciado");

    private final String descricao;
    
    EstadoCivil(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
