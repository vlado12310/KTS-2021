import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CoreModule } from './core/core.module';
import { HomeModule } from './home/home.module';
import { ManagerViewComponent } from './manager-view/manager-view.component';
import { WaiterViewComponent } from './waiter-view/waiter-view.component';
import { BarmanViewComponent } from './barman-view/barman-view.component';
import { CookViewComponent } from './cook-view/cook-view.component';

@NgModule({
  declarations: [
    AppComponent,
    ManagerViewComponent,
    WaiterViewComponent,
    BarmanViewComponent,
    CookViewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CoreModule,
    HomeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
