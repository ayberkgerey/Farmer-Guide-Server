package com.geray.farmerserver.repo;

import com.geray.farmerserver.model.Plant;

import java.util.List;
import java.util.Optional;

public interface PlantDao {
    public void insertPlant(Plant plant);
    List<Plant> selectAllPlant();
    Optional<Plant> getPlantById(String id);
    public void deletePlantById(String id);
    public void updatePlantById(String id,Plant plant);
}