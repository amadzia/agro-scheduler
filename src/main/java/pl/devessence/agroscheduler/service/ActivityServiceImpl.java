package pl.devessence.agroscheduler.service;

import org.springframework.stereotype.Service;
import pl.devessence.agroscheduler.domain.Activity;
import pl.devessence.agroscheduler.repository.ActivityRepository;

@Service
public class ActivityServiceImpl implements ActivityService {

    private ActivityRepository activityRepository;

    public ActivityServiceImpl(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @Override
    public Iterable<Activity> getActivities() {
        return this.activityRepository.findAll();
    }

    @Override
    public Activity save(Activity activity) {
        return this.activityRepository.save(activity);
    }
}
