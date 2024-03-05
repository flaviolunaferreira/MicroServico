export interface ClientesResponseDTO {
  id: number;
  tipoDePessoa: string;
  nomeRazao: string;
  nome: string;
  conjuge: string;
  preCadastroCliente: boolean;
  atualizaPessoa: boolean;
  sexo: string;
  estadoCivil: string;
  dataNascimento: string;
  idLoja: number;
  contribuinteDoIcms: boolean;
  indPrestServConstCivil: number;
  regraFiscalDeSaidaAtivada: boolean;
}
