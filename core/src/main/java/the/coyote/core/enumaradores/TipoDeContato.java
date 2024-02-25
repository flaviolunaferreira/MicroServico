package the.coyote.core.enumaradores;


    public enum TipoDeContato {
    
        TELEFONE_COMERCIAL("Telefone Comercial"),
        TELEFONE_RESIDENCIAL("Telefone Residencial"),
        CELULAR_PARTICULAR("Celular Particular"),
        CELULAR_EMPRESA("Celular Empresa"),
        FAX("Fax"),
        SITE("Site"),
        EMAIL_COMERCIAL("Email Comercial"),
        EMAIL_PARTICULAR("Email Particular"),
        EMAIL_COBRANCA("Email Cobrança"),
        TELEFONE_COBRANCA("Telefone Cobrança"),
        FAX_COBRANCA("Fax Cobrança"),
        RADIO_NEXTEL("Rádio Nextel"),
        EMAIL_NOTA_FISCAL_ELETRONICA("Email Nota Fiscal Eletrônica"),
        EMAIL_EDI("Email EDI"),
        EMAIL_NOTA_FISCAL_DE_SERVICO_ELETRONICA("Email Nota Fiscal de Serviço Eletrônica"),
        EMAIL_ECOMMERCE("Email E-commerce"),
        TELEFONE_ECOMMERCE("Telefone E-commerce"),
        TELEFONE_REFERENCIA("Telefone Referência"),
        WHATSAPP("WhatsApp"),
        EMAIL_RASTREAMENTO_CARGA("Email Rastreamento Carga"),
        EMAIL_EMISSAO_CT_E("Email Emissão CT-E"),
        EMAIL_BI("Email BI"),
        OUTRO("Outro");
    
        private final String descricao;
    
        TipoDeContato(String descricao) {
            this.descricao = descricao;
        }
    
        public String getDescricao() {
            return descricao;
        }
}
