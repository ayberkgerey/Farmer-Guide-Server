
package com.geray.farmerserver.service;

import com.geray.farmerserver.model.Plant;
import com.geray.farmerserver.repo.PlantDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class PlantService {

    private final PlantDao plantDao;

    public PlantService(@Qualifier("postgres") PlantDao plantDao) {
        this.plantDao = plantDao;
    }

    public Collection<Plant> getAllPlants() {
        return plantDao.selectAllPlant();
    }

    public void addPlant(Plant plant) {
        plantDao.insertPlant(plant);
    }

    public void deletePlantById(String id) {
        plantDao.deletePlantById(id);
    }

    public Optional<Plant> getPlantById(String id) {
        return plantDao.getPlantById(id);
    }

    public void updatePlant(String id, Plant plant) {
        plantDao.updatePlantById(id,plant);
    }
}