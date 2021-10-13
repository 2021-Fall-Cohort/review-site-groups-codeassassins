package org.wecancodeit.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.Phone;

public interface ManufacturerRepository extends CrudRepository<Phone, String> {
}
