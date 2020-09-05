package com.geray.farmerserver.repo;

import com.geray.farmerserver.model.Plant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository("fakeDao")
public class FakePlantDao implements PlantDao {

    private static List<Plant> DB = new ArrayList<>();

    static{
        DB.add(new Plant("0","domates","sebze","kış","tohum","www.asdas","makarinabla bla description"));
    }

    @Override
    public void insertPlant(Plant plant) {
        DB.add(DB.size(),plant);
    }

    @Override
    public List<Plant> selectAllPlant() {
        return DB;
    }

    @Override
    public Plant getPlantById(String id) {
        return DB.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    @Override
    public void deletePlantById(String id) {
        DB.remove(id);
    }

    @Override
    public void updatePlantById(String id, Plant update) {
        DB.set(DB.indexOf(getPlantById(id)),update);
    }


}
