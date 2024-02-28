package the.coyote.core.enumaradores;

public enum TipoDeContaBancaria {

    CORRENTE("Corrente"),
    POUPANCA("Poupança");

    
    private final String descricao;
    
    TipoDeContaBancaria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
