import { Component, OnInit } from '@angular/core';
import { RouterOutlet, Router } from '@angular/router';
import { MenuPrincipalComponent } from "./menu/menu-principal/menu-principal.component";
import { PrincipalComponent } from './paginas/principal/principal.component';

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.scss',
    imports: [MenuPrincipalComponent, PrincipalComponent, RouterOutlet]
})
export class AppComponent {
  title = 'organize';

}
