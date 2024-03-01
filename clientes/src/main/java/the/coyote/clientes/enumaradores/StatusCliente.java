package the.coyote.clientes.enumaradores;

public enum StatusCliente {
    
    CREDITO_OK("Credito ok"),
    DEVEDOR("Devedor"),
    BLOQUEADO("Bloqueado"),
    PROTESTADO("Protestado"),
    EM_ANALISE("Em análise");

    private final String descricao;
    
    StatusCliente(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
