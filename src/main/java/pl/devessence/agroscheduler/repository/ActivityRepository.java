package pl.devessence.agroscheduler.repository;

import org.springframework.data.repository.CrudRepository;
import pl.devessence.agroscheduler.domain.Activity;

public interface ActivityRepository extends CrudRepository<Activity, Long> {
}
