package com.pagisoft.allegrostats.dao;

import com.pagisoft.allegrostats.model.PopularityData;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface PopularityDataDao extends CrudRepository<PopularityData, Long>, JpaSpecificationExecutor<PopularityData> {

}
