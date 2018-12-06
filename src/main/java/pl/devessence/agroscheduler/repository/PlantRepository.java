package pl.devessence.agroscheduler.repository;

import org.springframework.data.repository.CrudRepository;
import pl.devessence.agroscheduler.domain.Plant;

public interface PlantRepository extends CrudRepository<Plant, Long> {
}
