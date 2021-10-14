package org.wecancodeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.Phone;

public interface ManufacturerRepository extends CrudRepository<Phone, String> {
}
