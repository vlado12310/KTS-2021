import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import * as fromComponents from './components';


@NgModule({
  declarations: [...fromComponents.components],
  imports: [CommonModule, FormsModule],
  exports: [FormsModule, ...fromComponents.components]
})
export class SharedModule { }
