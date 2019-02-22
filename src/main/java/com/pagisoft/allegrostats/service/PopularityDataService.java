package com.pagisoft.allegrostats.service;

import com.google.common.collect.Lists;
import com.pagisoft.allegrostats.dao.PopularityDataDao;
import com.pagisoft.allegrostats.model.PopularityData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PopularityDataService {

    @Autowired
    private PopularityDataDao popularityDataDao;

    public List<PopularityData> getAllPopularityData(){
        return Lists.newArrayList(this.popularityDataDao.findAll());
    }

    public List<PopularityData> findByCategoryId(String categoryId){
        return Lists.newArrayList(this.popularityDataDao.findByCategoryId(categoryId));
    }

}
