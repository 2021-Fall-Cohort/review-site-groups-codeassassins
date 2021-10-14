package org.wecancodeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.Phone;

public interface PhoneRepository extends CrudRepository<Phone, String> {
}
