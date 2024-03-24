import { Component } from '@angular/core';
import { OpcoesComponent } from "../../componentes/opcoes/opcoes.component";

@Component({
    selector: 'app-fornecedores',
    standalone: true,
    templateUrl: './fornecedores.component.html',
    styleUrl: './fornecedores.component.scss',
    imports: [OpcoesComponent]
})
export class FornecedoresComponent {

}
