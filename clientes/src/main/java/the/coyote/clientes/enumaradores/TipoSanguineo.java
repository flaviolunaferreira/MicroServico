package the.coyote.clientes.enumaradores;

public enum TipoSanguineo {

    A_POSITIVO("Boleto"),
    A_NEGATIVO("Cartao loja"),
    B_POSITIVO("Carteira"),
    B_NEGATIVO("Carteira"),
    AB_POSITIVO("Carteira"),
    O_POSITIVO("Carteira"),
    O_NEGATIVO("Carteira"),
    AB_NEGATIVO("Cheque");

    
    private final String descricao;
    
    TipoSanguineo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
