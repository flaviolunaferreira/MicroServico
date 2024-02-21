package the.coyote.clientes.enumeradores;

public enum TipoDeEndereco {
    
    FATURAMENTO("Faturamento"),
    ENTREGA("Entrega"),
    COBRANCA("Cobrança"),
    EMPREGADOR("Empregador"),
    ADICIONAL("Adicional"),
    ECOMMERCE("Ecommerce");

    private final String descricao;
    
    TipoDeEndereco(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
