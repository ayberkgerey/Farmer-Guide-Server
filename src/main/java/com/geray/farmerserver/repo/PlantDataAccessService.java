package com.geray.farmerserver.repo;

import com.geray.farmerserver.model.Plant;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("postgres")
public class PlantDataAccessService implements PlantDao{
    @Override
    public void insertPlant(Plant plant) {

    }

    @Override
    public List<Plant> selectAllPlant() {
        return null;
    }

    @Override
    public Plant getPlantById(String id) {
        return null;
    }

    @Override
    public void deletePlantById(String id) {

    }

    @Override
    public void updatePlantById(String id, Plant plant) {

    }
}
