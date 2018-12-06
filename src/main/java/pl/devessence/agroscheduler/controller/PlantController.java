package pl.devessence.agroscheduler.controller;

import org.springframework.web.bind.annotation.*;
import pl.devessence.agroscheduler.domain.Plant;
import pl.devessence.agroscheduler.service.PlantService;

@RestController
@RequestMapping("/api/plants")
public class PlantController {

    private PlantService plantService;

    public PlantController(PlantService plantService) {
        this.plantService = plantService;
    }

    @GetMapping({"", "/"})
    public Iterable<Plant> getPlants() {
        return this.plantService.getPlants();
    }

    @PostMapping({"", "/"})
    public Plant savePlant(@RequestBody Plant plant) {
        return this.plantService.save(plant);
    }

}
