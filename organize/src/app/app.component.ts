import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PrincipalComponent } from "./pages/principal/principal.component";
import { MenuPrincipalComponent } from "./menu/menu-principal/menu-principal.component";
import { TituloComponent } from "./componentes/titulo/titulo.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.scss',
    imports: [RouterOutlet, PrincipalComponent, MenuPrincipalComponent, TituloComponent]
})
export class AppComponent {
  title = 'organize';
}
