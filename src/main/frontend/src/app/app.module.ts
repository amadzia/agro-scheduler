import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ActivitiesComponent } from './activities/activities.component';
import { ActivitiesAddComponent } from './activities/activities-add/activities-add.component';
import { ActivitiesListComponent } from './activities/activities-list/activities-list.component';
import {HttpClientModule} from "@angular/common/http";
import {ActivityService} from "./activities/activity.service";
import {FormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    ActivitiesComponent,
    ActivitiesAddComponent,
    ActivitiesListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ActivityService],
  bootstrap: [AppComponent]
})
export class AppModule { }
