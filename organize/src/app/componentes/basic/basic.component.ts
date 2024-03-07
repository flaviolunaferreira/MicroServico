import { Component, Input, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Colunas } from 'src/app/interface/Colunas';
import { ToolbarComponent } from "../toolbar/toolbar.component";

@Component({
    selector: 'tela-base',
    standalone: true,
    templateUrl: './basic.component.html',
    styleUrl: './basic.component.scss',
    imports: [CommonModule, ToolbarComponent]
})
export class BasicComponent {

  @Input() data: any[] = [];
  @Input() colunas: Colunas[] = [];

  handleButtonClick(item: any) {
    // Lógica para lidar com o clique no botão
    console.log('Botão clicado para o item:', item);
  }

}
