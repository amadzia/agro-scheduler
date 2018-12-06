package pl.devessence.agroscheduler;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.devessence.agroscheduler.domain.Plant;
import pl.devessence.agroscheduler.service.PlantService;

import java.time.LocalDate;

@SpringBootApplication
public class AgroSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgroSchedulerApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(PlantService plantService) {
        return args -> {
            plantService.save(new Plant(1L, "Strawberry", "Water the plant with fertilizer made from the nettle", LocalDate.ofYearDay(2019, 75), LocalDate.ofYearDay(2019, 215),
                    5, 30, true, true, false, "Fertilizer concentration can not be higher than 5%", false));
        };
    }
}
