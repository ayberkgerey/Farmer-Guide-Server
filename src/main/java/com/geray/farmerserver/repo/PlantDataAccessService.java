package com.geray.farmerserver.repo;

import com.geray.farmerserver.model.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("postgres")
public class PlantDataAccessService implements PlantDao{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PlantDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insertPlant(Plant plant) {

    }

    @Override
    public List<Plant> selectAllPlant() {
        final String sql = "SELECT * FROM plant";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            String id = resultSet.getString("id");
            String name = resultSet.getString("name");
            String type = resultSet.getString("type");
            String season = resultSet.getString("season");
            String plantType = resultSet.getString("plantType");
            String imageSrc = resultSet.getString("imageSrc");
            String description = resultSet.getString("description");
            return new Plant(id,name,type,season,plantType,imageSrc,description);
        });
    }

    @Override
    public Optional<Plant> getPlantById(String id) {
        final String sql = "SELECT * FROM plant WHERE id = ?";
        Plant plant = jdbcTemplate.queryForObject(sql, new Object[]{id}, (resultSet, i) -> {
            String plantid = resultSet.getString("id");
            String name = resultSet.getString("name");
            String type = resultSet.getString("type");
            String season = resultSet.getString("season");
            String plantType = resultSet.getString("plantType");
            String imageSrc = resultSet.getString("imageSrc");
            String description = resultSet.getString("description");
            return new Plant(plantid,name,type,season,plantType,imageSrc,description);
        });
        return Optional.ofNullable(plant);
    }

    @Override
    public void deletePlantById(String id) {

    }

    @Override
    public void updatePlantById(String id, Plant plant) {

    }
}
