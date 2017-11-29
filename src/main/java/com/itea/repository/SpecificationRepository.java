package com.itea.repository;

import com.itea.domain.Specification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "specification", path = "specification")
public interface SpecificationRepository extends MongoRepository<Specification,String>{

    List<Specification> findByKey(@Param("key") String key);
}
