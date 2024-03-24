import { Component } from '@angular/core';
import { OpcoesComponent } from "../../componentes/opcoes/opcoes.component";

@Component({
    selector: 'app-produtos',
    standalone: true,
    templateUrl: './produtos.component.html',
    styleUrl: './produtos.component.scss',
    imports: [OpcoesComponent]
})
export class ProdutosComponent {

}
