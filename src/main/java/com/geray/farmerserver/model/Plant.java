package com.geray.farmerserver.model;

public class Plant {
    private String id;
    private String name;
    private String type;
    private String season;
    private String plantType;
    private String imageSrc;
    private String description;

    public Plant() {
    }

    public Plant(String id, String name, String type, String season, String plantType, String imageSrc, String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.season = season;
        this.plantType = plantType;
        this.imageSrc = imageSrc;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getPlantType() {
        return plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
