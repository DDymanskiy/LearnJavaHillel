package com.hillel;

public enum Fabric {
    cardboard("Картон"),
    metal("Металл"),
    cloth("Ткань");

    private String description;

    Fabric (String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
