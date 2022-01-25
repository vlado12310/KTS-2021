import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import * as fromComponents from './components';
import { InputComponent } from './components/input/input.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';


@NgModule({
  declarations: [...fromComponents.components, InputComponent],
  imports: [CommonModule, FormsModule, FontAwesomeModule],
  exports: [FormsModule, FontAwesomeModule, ...fromComponents.components]
})
export class SharedModule { }
