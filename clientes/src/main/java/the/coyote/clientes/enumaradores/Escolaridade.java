package the.coyote.clientes.enumaradores;

public enum Escolaridade {
    
    PRE("Pré-Escola"),
    PRIMARIO("Ensino Fundamental - 1º ao 5º Ano"),
    FUNDAMENTAL("Ensino Fundamental - 6º ao 9º Ano"),
    MEDIO("Ensino Médio"),
    SUPERIOR("Ensino Superior"),
    SUPERIOR_INCOMPLETO("Ensino Superior Incompleto");

    private String descricao;

    Escolaridade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
