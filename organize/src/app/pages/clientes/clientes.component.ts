import { Component, OnInit } from '@angular/core';
import { ClientesResponseDTO } from 'src/app/interface/ClientesResponseDTO';
import { ClientesService } from './clientes.service';

@Component({
  selector: 'app-clientes',
  standalone: true,
  imports: [],
  templateUrl: './clientes.component.html',
  styleUrl: './clientes.component.scss'
})
export class ClientesComponent implements OnInit {

  clientes!: ClientesResponseDTO[];
  clientesSelecionados!: ClientesResponseDTO;

  loading: boolean = true;

  constructor(private clientesService: ClientesService) {};

  ngOnInit() {
    this.getAllClientes();
  }


  getAllClientes() {
    console.log("iniciando requisição")
    this.clientesService.getAllClientes(0,100).subscribe((clientes) => {
      this.clientes = clientes;
      console.log(clientes)
      this.loading = false;
    })
  }

}
