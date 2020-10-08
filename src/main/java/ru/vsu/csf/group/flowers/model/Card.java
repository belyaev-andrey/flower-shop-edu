package ru.vsu.csf.group.flowers.model;

import java.io.File;

public class Card extends Goods {

    private File picture;

    public File getPicture() {
        return picture;
    }

    public void setPicture(File picture) {
        this.picture = picture;
    }
}
