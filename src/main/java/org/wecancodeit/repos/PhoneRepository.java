package org.wecancodeit.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.Phone;

public interface PhoneRepository extends CrudRepository<Phone, String> {
}
