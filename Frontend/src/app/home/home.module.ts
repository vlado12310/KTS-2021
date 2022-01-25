import { NgModule } from "@angular/core";
import { SharedModule } from "@nvt/shared/shared.module";
import { LoginComponent } from ".";
import { HomeComponent } from "./home.component";

@NgModule({
    declarations: [HomeComponent, LoginComponent],
    imports: [SharedModule],
    exports: [HomeComponent]
})
export class HomeModule { }