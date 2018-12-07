package pl.devessence.agroscheduler.controller;

import org.springframework.web.bind.annotation.*;
import pl.devessence.agroscheduler.domain.Activity;
import pl.devessence.agroscheduler.service.ActivityService;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {

    private ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @GetMapping({"", "/"})
    public Iterable<Activity> getActivities() {
        return this.activityService.getActivities();
    }

    @PostMapping({"", "/"})
    public Activity savePlant(@RequestBody Activity activity) {
        return this.activityService.save(activity);
    }

}
