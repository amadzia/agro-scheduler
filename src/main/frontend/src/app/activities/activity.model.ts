export class Activity {
  public activityName: string;
  public creationDate: string;
  public completed: boolean;

  constructor(activityName: string, creationDate: string ,completed: boolean){
    this.activityName = activityName;
    this.creationDate = creationDate;
    this.completed = completed;
  }

}
