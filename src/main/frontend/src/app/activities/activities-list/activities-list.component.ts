import { Component, OnInit } from '@angular/core';
import {Activity} from "../activity.model";
import {ActivityService} from "../activity.service";

@Component({
  selector: 'app-activities-list',
  templateUrl: './activities-list.component.html',
  styleUrls: ['./activities-list.component.css']
})
export class ActivitiesListComponent implements OnInit {

  activities: Activity[]=[];

  constructor(private activityService: ActivityService) { }

  ngOnInit() {
    this.activityService.getActivities()
      .subscribe(
        (activities: any[]) => {
          this.activities=activities
        },
        (error) => console.log(error)
      );

    this.activityService.onActivityAdded.subscribe(
      (activity: Activity) => this.activities.push(activity)
    );
  }

  onActivityChange(event, activity: Activity) {
    this.activityService.saveActivity(activity, event.target.checked).subscribe();
  }

  getCreationDateLabel(activity: Activity) {
    return activity.completed ? "badge-pill badge-secondary" : 'badge-pill badge-primary';
  }
}
