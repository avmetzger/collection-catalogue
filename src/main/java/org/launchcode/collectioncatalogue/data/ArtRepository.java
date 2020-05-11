package org.launchcode.collectioncatalogue.data;

import org.launchcode.collectioncatalogue.models.Art;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtRepository extends CrudRepository<Art, Integer> {

}
