package the.coyote.clientes.enumeradores;

public enum Sexo {
    
    M("Masculino"),
    F("Feminino"),
    O("Outros");

    private final String descricao;
    
    Sexo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
