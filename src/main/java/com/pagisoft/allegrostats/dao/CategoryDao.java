package com.pagisoft.allegrostats.dao;

import com.pagisoft.allegrostats.model.CategoryDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(exported = false)
public interface CategoryDao extends CrudRepository<CategoryDTO, Long> {
    List<CategoryDTO> findByParentId(@Param("parentId") String parentId);
}
