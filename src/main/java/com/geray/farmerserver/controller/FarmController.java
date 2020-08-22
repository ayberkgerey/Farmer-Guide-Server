package com.geray.farmerserver.controller;

import com.geray.farmerserver.model.Plant;
import com.geray.farmerserver.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequestMapping("/")
@RestController
public class FarmController {

    private final PlantService plantService;

    @Autowired
    public FarmController(PlantService plantService) { this.plantService = plantService;}

    @GetMapping
    public Collection<Plant> getAllPlants(){
        return plantService.getAllPlants();
    }

    @GetMapping("{id}")
    public Plant getPlantById(@PathVariable String id){
        return plantService.getPlantById(id);
    }

    @PostMapping
    public void addPlant(@RequestBody Plant plant){
        plantService.addPlant(plant);
    }

    @DeleteMapping("{id}")
    public void deletePlantById(@PathVariable String id){
        plantService.deletePlantById(id);
    }

}
