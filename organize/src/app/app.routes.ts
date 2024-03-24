import { Routes } from '@angular/router';
import { PrincipalComponent } from './paginas/principal/principal.component';
import { ClientesComponent } from './paginas/clientes/clientes.component';
import { FornecedoresComponent } from './paginas/fornecedores/fornecedores.component';
import { FuncionariosComponent } from './paginas/funcionarios/funcionarios.component';
import { ProdutosComponent } from './paginas/produtos/produtos.component';


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
  { path: 'clientes', component: ClientesComponent },
  { path: 'fornecedores', component: FornecedoresComponent },
  { path: 'funcionarios', component: FuncionariosComponent },
  { path: 'produtos', component: ProdutosComponent }
];
