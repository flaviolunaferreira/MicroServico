import { Routes } from '@angular/router';
import { PrincipalComponent } from './pages/principal/principal.component';
import { MenuPrincipalComponent } from './menu/menu-principal/menu-principal.component';
import { ClientesComponent } from './pages/clientes/clientes.component';
import { AppComponent } from './app.component';


export const routes: Routes = [
  {
    path: '',
    redirectTo: 'inicio',
    pathMatch: 'full'
  },
  {
    path: 'inicio',
    component: PrincipalComponent,
    children: [
      { path: '', redirectTo: 'principal', pathMatch: 'full' },
      { path: 'principal', component: PrincipalComponent},
    ]
  },
  { path: 'clientes', component: ClientesComponent }
];
