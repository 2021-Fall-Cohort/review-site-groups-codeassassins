package org.wecancodeit.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.PhoneList;

public interface PhoneListRepository extends CrudRepository<PhoneList, String> {
}
