package com.geray.farmerserver.repo;

import com.geray.farmerserver.model.Plant;

import java.util.List;

public interface PlantDao {
    public void insertPlant(Plant plant);
    List<Plant> selectAllPlant();
    Plant getPlantById(String id);
    public void deletePlantById(String id);
    public void updatePlantById(String id,Plant plant);


}
