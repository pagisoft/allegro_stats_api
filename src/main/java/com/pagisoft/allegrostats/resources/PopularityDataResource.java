package com.pagisoft.allegrostats.resources;

import com.pagisoft.allegrostats.model.PopularityData;
import com.pagisoft.allegrostats.service.PopularityDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/popularityData")
public class PopularityDataResource {

    @Autowired
    private PopularityDataService popularityDataService;

    // http://localhost:8080/popularityData
    @RequestMapping("")
    public List<PopularityData> getAll() {
        return popularityDataService.getAllPopularityData();
    }

    // http://localhost:8080/popularityData/filterByCategoryId?categoryId=1
    @RequestMapping("filterByCategoryId")
    public List<PopularityData> findByCategoryId(@RequestParam(value="categoryId", required=true) String categoryId) {
        return popularityDataService.findByCategoryId(categoryId);
    }

}
