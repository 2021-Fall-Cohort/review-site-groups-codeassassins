package org.wecancodeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.Hashtag;

import java.util.Optional;

public interface HashtagRepository extends CrudRepository<Hashtag, String> {
    Optional<Hashtag> findByNameIgnoreCase(String name);

}
