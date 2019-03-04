package com.pagisoft.allegrostats.resources;

import com.pagisoft.allegrostats.model.PopularityData;
import com.pagisoft.allegrostats.service.PopularityDataService;
import com.pagisoft.allegrostats.specification.CustomRsqlVisitor;
import cz.jirutka.rsql.parser.RSQLParser;
import cz.jirutka.rsql.parser.ast.Node;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/popularityData")
@Api(value="popularity_data", description="Operations related to popularity data")
public class PopularityDataResource {

    @Autowired
    private PopularityDataService popularityDataService;

    // http://localhost:8080/popularityData?search=popularity>10;categoryId==4

    @ApiOperation(value = "View a list of available popularity data", response = PopularityData.class, responseContainer="List")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PopularityData> getAll(
            @ApiParam(value = "RSQL based search query <a href=\"https://github.com/jirutka/rsql-parser#grammar-and-semantic\" target=\"_blank\">RSQL Semantic</a>", required = false)
            @RequestParam(value = "search", required = false) String search) {

        List<PopularityData> data = new ArrayList<>();

        if (search != null) {
            Node rootNode = new RSQLParser().parse(search);
            Specification<PopularityData> spec = rootNode.accept(new CustomRsqlVisitor<PopularityData>());
            data = popularityDataService.getAllPopularityData(spec);
        } else {
            data = popularityDataService.getAllPopularityData();
        }

        return data;
    }

}
