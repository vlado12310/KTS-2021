import { Component, ElementRef, Input, OnInit, ViewChild } from '@angular/core';
import { IconDefinition, IconProp } from '@fortawesome/fontawesome-svg-core';

@Component({
  selector: 'shared-input',
  templateUrl: './input.component.html',
  styleUrls: ['./input.component.scss']
})
export class InputComponent implements OnInit {

  @ViewChild('input', { static: true })
  public textInput!: ElementRef;

  @Input()
  public placeholder: string = '';

  @Input()
  public icon: any;

  @Input()
  public caption: string = '';

  @Input()
  public type: string = 'Text';

  @Input()
  public required: string = '';

  public isVisited: boolean = false;

  public validationMessage: string = '';

  constructor() { }

  ngOnInit(): void {
  }

  public hasIcon(): boolean {
    return this.icon !== undefined;
  }

  public hasCaption(): boolean {
    return this.caption !== '';
  }

  public isInputEmpty(): boolean {
    return this.textInput.nativeElement.value.length === 0;
  }

  public visit(): void {
    this.isVisited = true;
    if (this.requiredValidation()) {
      this.validationMessage = this.required;
    }
  }

  public requiredValidation(): boolean {
    return this.isInputEmpty() && this.isVisited && this.required !== '';
  }

}
