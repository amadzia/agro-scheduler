package pl.devessence.agroscheduler;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.devessence.agroscheduler.domain.Activity;
import pl.devessence.agroscheduler.service.ActivityService;

import java.time.LocalDate;

@SpringBootApplication
public class AgroSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgroSchedulerApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ActivityService activityService) {
        return args -> {
            activityService.save(new Activity(1L, "The second quarter: Pour the strawberries with nettle fertilizer",
                    LocalDate.now(), false));
            activityService.save(new Activity(2L, "From December to February: Protect the young trees with limestone milk",
                    LocalDate.now(), false));
        };
    }
}
