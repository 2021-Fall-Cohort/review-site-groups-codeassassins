package org.wecancodeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.Manufacturer;

public interface ManufacturerRepository extends CrudRepository<Manufacturer, String> {
}
