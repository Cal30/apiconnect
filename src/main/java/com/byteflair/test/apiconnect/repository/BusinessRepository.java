package com.byteflair.test.apiconnect.repository;

import com.byteflair.test.apiconnect.domain.Business;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by calata on 13/07/16.
 */
@RepositoryRestResource(collectionResourceRel = "business", path = "business")
public interface BusinessRepository extends MongoRepository<Business, String> {

}
