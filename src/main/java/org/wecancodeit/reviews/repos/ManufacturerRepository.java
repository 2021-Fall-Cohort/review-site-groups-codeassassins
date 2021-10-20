package org.wecancodeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.Manufacturer;

import java.util.Optional;

public interface ManufacturerRepository extends CrudRepository<Manufacturer, Long> {
    Optional<Manufacturer> findByName(Manufacturer name);
}
