package org.wecancodeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.Phone;

public interface PhoneRepository extends CrudRepository<Phone, Long> {
    Phone findById(Phone Long);
}
