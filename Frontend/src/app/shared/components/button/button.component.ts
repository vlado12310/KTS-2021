import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'shared-button',
  templateUrl: './button.component.html',
  styleUrls: ['./button.component.scss']
})
export class ButtonComponent implements OnInit {

  @Input()
  public text: string = '';

  @Input()
  public icon: string = '';

  @Output()
  public onClick: EventEmitter<Event> = new EventEmitter<Event>();

  constructor() { }

  ngOnInit(): void {
  }

  public getText(): string {
    return this.icon !== '' ? this.text + ' ' + this.icon : this.text;
  }

  public click(event: Event): void {
    console.log("CLICKED")
    this.onClick.emit(event);
  }

}
