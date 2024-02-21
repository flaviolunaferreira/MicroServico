package the.coyote.clientes.enumeradores;

public enum TipoDeLimite {
    
    BOLETO("Boleto"),
    CARTAO_LOJA("Cartao loja"),
    CARTEIRA("Carteira"),
    CHEQUE("Cheque");

    
    private final String descricao;
    
    TipoDeLimite(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
