package pl.devessence.agroscheduler.service;

import pl.devessence.agroscheduler.domain.Activity;

public interface ActivityService {

    Iterable<Activity> getActivities();

    Activity save(Activity activity);
}
