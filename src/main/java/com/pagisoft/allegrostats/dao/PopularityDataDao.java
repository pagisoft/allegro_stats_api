package com.pagisoft.allegrostats.dao;

import com.pagisoft.allegrostats.model.PopularityData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(exported = false)
public interface PopularityDataDao extends CrudRepository<PopularityData, Long> {

    List<PopularityData> findByCategoryId(@Param("categoryId") String categoryId);

}
