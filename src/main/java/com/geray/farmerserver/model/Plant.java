package com.geray.farmerserver.model;

import javax.validation.constraints.NotBlank;

public class Plant {

    @NotBlank
    private String id;
    @NotBlank
    private String name;
    @NotBlank
    private String type;
    @NotBlank
    private String season;
    @NotBlank
    private String plantType;
    @NotBlank
    private String imageSrc;

    public Plant() {
    }

    public Plant(String id, String name, String type, String season, String plantType,String imageSrc) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.season = season;
        this.plantType = plantType;
        this.imageSrc = imageSrc;
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


}
