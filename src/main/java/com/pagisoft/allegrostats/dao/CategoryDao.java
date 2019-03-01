package com.pagisoft.allegrostats.dao;

import com.pagisoft.allegrostats.model.CategoryDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface CategoryDao extends CrudRepository<CategoryDTO, Long> {

}
