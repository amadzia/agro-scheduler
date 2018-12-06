package pl.devessence.agroscheduler.service;

import pl.devessence.agroscheduler.domain.Plant;

public interface PlantService {

    Iterable<Plant> getPlants();

    Plant save(Plant plant);
}
