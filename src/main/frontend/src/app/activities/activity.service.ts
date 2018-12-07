import {HttpClient} from "@angular/common/http";
import {EventEmitter, Injectable} from "@angular/core";
import "rxjs/add/operator/map"
import {Activity} from "./activity.model";

@Injectable()
export class ActivityService {

  onActivityAdded = new EventEmitter<Activity>();

  constructor(private http: HttpClient) {

  }

  getActivities() {
    return this.http.get('/api/activities');
  }

  saveActivity(activity: Activity, checked: boolean) {
    activity.completed = checked;
    return this.http.post('/api/activities', activity);
  }

  addActivity(activity: Activity) {
    return this.http.post('/api/activities', activity);
  }
}
