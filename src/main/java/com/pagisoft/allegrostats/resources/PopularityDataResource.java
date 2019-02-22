package com.pagisoft.allegrostats.resources;

import com.pagisoft.allegrostats.model.PopularityData;
import com.pagisoft.allegrostats.service.PopularityDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/popularityData")
@Api(value="popularity_data", description="Operations related to popularity data")
public class PopularityDataResource {

    @Autowired
    private PopularityDataService popularityDataService;

    // http://localhost:8080/popularityData
    @ApiOperation(value = "View a list of available popularity data", response = List.class)
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<PopularityData> getAll() {
        return popularityDataService.getAllPopularityData();
    }

    // http://localhost:8080/popularityData/filterByCategoryId?categoryId=1
    @ApiOperation(value = "View a list of available popularity data filtered by category id", response = List.class)
    @RequestMapping(value = "filterByCategoryId", method = RequestMethod.GET)
    public List<PopularityData> findByCategoryId(@RequestParam(value="categoryId", required=true) String categoryId) {
        return popularityDataService.findByCategoryId(categoryId);
    }

}
