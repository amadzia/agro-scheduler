package pl.devessence.agroscheduler.service;

import org.springframework.stereotype.Service;
import pl.devessence.agroscheduler.domain.Plant;
import pl.devessence.agroscheduler.repository.PlantRepository;

@Service
public class PlantServiceImpl implements PlantService {

    private PlantRepository plantRepository;

    public PlantServiceImpl(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    @Override
    public Iterable<Plant> getPlants() {
        return this.plantRepository.findAll();
    }

    @Override
    public Plant save(Plant plant) {
        return this.plantRepository.save(plant);
    }
}
