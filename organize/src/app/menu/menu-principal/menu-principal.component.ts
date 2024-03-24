import { Component, OnInit } from '@angular/core';
import { TituloComponent } from "../../componentes/titulo/titulo.component";
import { RouterOutlet, Router } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
    selector: 'app-menu-principal',
    standalone: true,
    templateUrl: './menu-principal.component.html',
    styleUrl: './menu-principal.component.scss',
    imports: [TituloComponent, RouterOutlet, CommonModule],
    providers: []
})
export class MenuPrincipalComponent implements OnInit {

  items: any | undefined;

  constructor(private router: Router) {}

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
            icon: 'pi pi-fw pi-trash',
            acao: () => {
              this.produtos();
            }
        },
        {
          label: 'Fornecedores',
          icon: 'pi pi-fw pi-plus',
          acao: () => {
            this.fornecedores();
          }
      },
      {
          label: 'Funcionários',
          icon: 'pi pi-fw pi-trash',
          acao: () => {
            this.funcionarios();
          }
      }
    ];
  }

  clientes() {
    this.router.navigateByUrl('clientes');
  }

  fornecedores() {
    this.router.navigateByUrl('fornecedores');
  }
  funcionarios() {
    this.router.navigateByUrl('funcionarios');
  }
  produtos() {
    this.router.navigateByUrl('produtos');
  }
}
