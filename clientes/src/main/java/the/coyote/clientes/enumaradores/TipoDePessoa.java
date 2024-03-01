package the.coyote.clientes.enumaradores;

public enum TipoDePessoa {
    
    FISICA("Física"),
    JURIDICA("Jurídica");

    
    private final String descricao;
    
    TipoDePessoa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
