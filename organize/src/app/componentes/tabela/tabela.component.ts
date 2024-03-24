import { Component, Input } from '@angular/core';
import { Colunas } from '../../interfaces/Colunas';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'tabela',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './tabela.component.html',
  styleUrl: './tabela.component.scss'
})
export class TabelaComponent {

  @Input() dados: any[] = [];
  @Input() colunas: Colunas[] = [];

}
