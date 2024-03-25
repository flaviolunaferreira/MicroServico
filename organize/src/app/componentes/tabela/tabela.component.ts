import { Component, Input, Output, EventEmitter } from '@angular/core';
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
  @Output() visualizar = new EventEmitter<any>();
  @Output() ordenar = new EventEmitter<any>();

  visualizarClick(item: any) {
    this.visualizar.emit(item);
  }

  ordenarClick(item: any) {
    this.ordenar.emit(item);
  }


}
