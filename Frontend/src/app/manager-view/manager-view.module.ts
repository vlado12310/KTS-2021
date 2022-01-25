import { NgModule } from "@angular/core";
import { SharedModule } from "@nvt/shared/shared.module";
import { ManagerViewComponent } from "./manager-view.component";

@NgModule({
    declarations: [ManagerViewComponent],
    imports: [SharedModule],
    exports: [ManagerViewComponent]
})
export class ManagerViewModule { }