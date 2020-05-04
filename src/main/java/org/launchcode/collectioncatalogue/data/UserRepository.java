package org.launchcode.collectioncatalogue.data;

import org.launchcode.collectioncatalogue.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Integer>{

    User findByUsername(String username);
}
