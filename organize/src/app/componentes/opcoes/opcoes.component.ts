import { Component, Input } from '@angular/core';

@Component({
  selector: 'opcoes',
  standalone: true,
  imports: [],
  templateUrl: './opcoes.component.html',
  styleUrl: './opcoes.component.scss'
})

export class OpcoesComponent {

  @Input() titulo: string = 'Título da Página';
  @Input() incluirFn!: () => void;
  @Input() imprimirFn!: () => void;
  @Input() exportarFn!: () => void;
  @Input() atualizarFn!: () => void;
  @Input() voltarFn!: () => void;
  termoConsulta: string = '';

  incluir() {
    this.incluirFn();
  }

  imprimir() {
    this.imprimirFn();
  }

  exportar() {
    this.exportarFn();
  }

  atualizar() {
    this.atualizarFn();
  }

  voltar() {
    this.voltarFn();
  }
}
