import {  Routes } from '@angular/router';
import { PrincipalComponent } from './pages/principal/principal.component';
import { MenuPrincipalComponent } from './menu/menu-principal/menu-principal.component';

export const routes: Routes = [
  { path: 'principal', component: PrincipalComponent, outlet: 'main' },
  { path: 'menu', component: MenuPrincipalComponent, outlet: 'menu'}
];


