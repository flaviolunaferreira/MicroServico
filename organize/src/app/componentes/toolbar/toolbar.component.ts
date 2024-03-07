import { Component, Input, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'toolbar',
  templateUrl: './toolbar.component.html',
  styleUrls: ['./toolbar.component.css'],
  standalone: true,
  imports: [CommonModule],
})
export class ToolbarComponent implements OnInit {

  @Input() color:String = 'default'

  constructor() { }

  ngOnInit() {
  }

}
