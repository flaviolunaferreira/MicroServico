import { Component, OnInit } from '@angular/core';
import { ClientesResponseDTO } from 'src/app/interface/ClientesResponseDTO';
import { ClientesService } from './clientes.service';
import { Colunas } from 'src/app/interface/Colunas';
import { BasicComponent } from "../../componentes/basic/basic.component";




@Component({
    selector: 'app-clientes',
    standalone: true,
    providers: [],
    templateUrl: './clientes.component.html',
    styleUrl: './clientes.component.scss',
    imports: [BasicComponent]
})
export class ClientesComponent implements OnInit {

  clientes!: ClientesResponseDTO[];
  colunas!: Colunas[]

  loading: boolean = true;

  constructor(private clientesService: ClientesService) {};

  ngOnInit() {
    this.clientesService.getAllClientes(0,100).subscribe((clientes) => {
      this.clientes = clientes;
      this.loading = false;
    });
    this.colunas = [
      {field: 'id',         header: 'Id.',    position: 'left', icon: 'null', label: 'null', type: 'null', width: '50px',   height: '2.5rem'},
      {field: 'nome',       header: 'Nome.',  position: 'left',   icon: 'null', label: 'null', type: 'null', width: '250px',  height: '2.5rem'},
      {field: 'nomeRazao',  header: 'Razão',  position: 'left',   icon: 'null', label: 'null', type: 'null', width: '250px',  height: '2.5rem'},
      {field: 'sexo',       header: 'Sexo',   position: 'center', icon: 'null', label: 'null', type: 'null', width: '50px',   height: '2.5rem'},
      {field: 'tipoPessoa', header: 'Pessoa', position: 'center', icon: 'null', label: 'null', type: 'null', width: '50px',   height: '2.5rem'}
    ]
  }


  // customSort(event: SortEvent) {
  //   event.data?.sort((data1, data2) => {
  //       let value1 = data1[event.field || ""];
  //       let value2 = data2[event.field || ""];
  //       let result = null;

  //       if (value1 == null && value2 != null) result = -1;
  //       else if (value1 != null && value2 == null) result = 1;
  //       else if (value1 == null && value2 == null) result = 0;
  //       else if (typeof value1 === 'string' && typeof value2 === 'string') result = value1.localeCompare(value2);
  //       else result = value1 < value2 ? -1 : value1 > value2 ? 1 : 0;

  //       return (event.order || -1) * result;
  //   });

  // }

}
