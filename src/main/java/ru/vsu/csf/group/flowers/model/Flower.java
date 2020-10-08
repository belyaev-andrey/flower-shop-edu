package ru.vsu.csf.group.flowers.model;

public abstract class Flower extends Goods {

    private String originCountry;

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }
}
