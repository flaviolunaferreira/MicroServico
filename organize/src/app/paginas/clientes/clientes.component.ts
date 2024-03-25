import { Component, OnInit } from '@angular/core';
import { OpcoesComponent } from "../../componentes/opcoes/opcoes.component";
import { ClientesResponseDTO } from '../../dtos/ClientesResponseDTO';
import { Colunas } from '../../interfaces/Colunas';
import { TabelaComponent } from "../../componentes/tabela/tabela.component";
import { ClienteService } from '../../services/Cliente.service';
import { ResumoComponent } from "../../componentes/resumo/resumo.component";

@Component({
    selector: 'app-clientes',
    standalone: true,
    providers: [],
    templateUrl: './clientes.component.html',
    styleUrl: './clientes.component.scss',
    imports: [OpcoesComponent, TabelaComponent, ResumoComponent]
})
export class ClientesComponent implements OnInit{

  clientes!: ClientesResponseDTO[];
  colunas!: Colunas[]

  loading: boolean = true;

  constructor(private clienteService: ClienteService) {};

  ngOnInit() {

      this.buscarClientes()

    this.colunas = [
      {campo: 'id',         titulo: 'Id.',    posicao: 'left',   icone: 'null', tipo: 'null', largura: '80px',   altura: '2rem'},
      {campo: 'nome',       titulo: 'Nome.',  posicao: 'left',   icone: 'null', tipo: 'null', largura: '300px',  altura: '2rem'},
      {campo: 'nomeRazao',  titulo: 'Razão',  posicao: 'left',   icone: 'null', tipo: 'null', largura: '300px',  altura: '2rem'},
      {campo: 'sexo',       titulo: 'Sexo',   posicao: 'center', icone: 'null', tipo: 'null', largura: '80px',   altura: '2rem'},
      {campo: 'nome',       titulo: 'Nome.',  posicao: 'left',   icone: 'null', tipo: 'null', largura: '300px',  altura: '2rem'},
      {campo: 'nomeRazao',  titulo: 'Razão',  posicao: 'left',   icone: 'null', tipo: 'null', largura: '300px',  altura: '2rem'},
      {campo: 'sexo',       titulo: 'Sexo',   posicao: 'center', icone: 'null', tipo: 'null', largura: '80px',   altura: '2rem'},
      {campo: 'tipoPessoa', titulo: 'Pessoa', posicao: 'center', icone: 'null', tipo: 'null', largura: '80px',   altura: '2rem'}
    ]

  }

  onBtnVisualizar(item: any) {
    console.log('Botão marcar acionado')
  }

  onBtnOrdenar(Item: any) {
    console.log('Botão ordenar selecionado')
  }

  buscarClientes() {
    this.clienteService.getAllClientes(0,100).subscribe((data) => {

      this.clientes = data;
      this.loading = false;

    });
  }
}
