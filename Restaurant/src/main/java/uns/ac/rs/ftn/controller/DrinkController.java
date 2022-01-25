package uns.ac.rs.ftn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uns.ac.rs.ftn.model.Drink;
import uns.ac.rs.ftn.service.DrinkService;

import java.util.List;

@RestController
@RequestMapping(value =  "/api/drink", produces = MediaType.APPLICATION_JSON_VALUE)
public class DrinkController {
    @Autowired
    private DrinkService drinkService;

    @GetMapping()
    public ResponseEntity<List<Drink>> getDrinks(){

        return new ResponseEntity<>(drinkService.findAll(), HttpStatus.OK);
    }
}
