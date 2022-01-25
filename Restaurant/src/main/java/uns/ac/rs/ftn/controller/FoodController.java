package uns.ac.rs.ftn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uns.ac.rs.ftn.service.FoodService;

@RestController
@RequestMapping(value =  "/api/food", produces = MediaType.APPLICATION_JSON_VALUE)
public class FoodController {
    @Autowired
    private FoodService foodService;

}
