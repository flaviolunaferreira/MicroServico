import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-titulo',
  standalone: true,
  imports: [],
  templateUrl: './titulo.component.html',
  styleUrl: './titulo.component.scss'
})
export class TituloComponent {

  constructor(private router: Router) {}

  retornarPrincipal() {
    this.router.navigateByUrl('inicio');
  }

}
