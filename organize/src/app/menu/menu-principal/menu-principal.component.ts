import { Component, OnInit } from '@angular/core';
import { TituloComponent } from "../../componentes/titulo/titulo.component";
import { RouterOutlet } from '@angular/router';
import { MenuItem , MessageService} from 'primeng/api';
import { CommonModule } from '@angular/common';

@Component({
    selector: 'app-menu-principal',
    standalone: true,
    templateUrl: './menu-principal.component.html',
    styleUrl: './menu-principal.component.scss',
    imports: [TituloComponent, RouterOutlet, CommonModule],
    providers: [MessageService]
})
export class MenuPrincipalComponent implements OnInit {

  items: any | undefined;

  constructor(private messageService: MessageService) {}

  ngOnInit() {
    this.items = [
        {
            label: 'Clientes',
            icon: 'pi pi-fw pi-plus',
            acao: () => {
              this.clientes();
            }
        },
        {
            label: 'Produtos',
            icon: 'pi pi-fw pi-trash'
        },
        {
          label: 'Fornecedores',
          icon: 'pi pi-fw pi-plus',
      },
      {
          label: 'Funcionários',
          icon: 'pi pi-fw pi-trash'
      }
    ];
  }

  clientes() {
    alert('clientes')
  }
}
