import { Component, OnInit } from '@angular/core';
import {ActivityService} from "../activity.service";
import {Activity} from "../activity.model";

@Component({
  selector: 'app-activities-add',
  templateUrl: './activities-add.component.html',
  styleUrls: ['./activities-add.component.css']
})
export class ActivitiesAddComponent implements OnInit {

  addActivityValue: string = null;

  constructor(private activityService: ActivityService) { }

  ngOnInit() {
  }

  onActivityAdd(event) {
    let activity: Activity = new Activity(event.target.value, this.getTodayAsString(),false);
    this.activityService.addActivity(activity)
      .subscribe(
        (newActivity: Activity) => {
          //clear the input
          this.addActivityValue = '';
          this.activityService.onActivityAdded.emit(newActivity);
        }
      );
  }

  getTodayAsString() {
    let today = new Date();
    let dd: any = today.getDate();
    let mm: any = today.getMonth() + 1;
    let yyyy = today.getFullYear();

    if (dd < 10) {
      dd = '0' + dd;
    }
    if (mm < 10) {
      mm = '0' + mm;
    }

    return mm + '/' + dd + '/' + yyyy;
  }
}
