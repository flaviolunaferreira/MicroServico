import { Component } from '@angular/core';
import { OpcoesComponent } from "../../componentes/opcoes/opcoes.component";

@Component({
    selector: 'app-funcionarios',
    standalone: true,
    templateUrl: './funcionarios.component.html',
    styleUrl: './funcionarios.component.scss',
    imports: [OpcoesComponent]
})
export class FuncionariosComponent {

}
