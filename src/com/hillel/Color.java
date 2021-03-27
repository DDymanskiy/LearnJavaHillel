package com.hillel;

public enum Color {
    RED("Красный"),
    BLUE("Синий"),
    WHITE("Белый"),
    BLACK("Черный"),
    GRAY("Серый"),
    BROWN("Коричневый"),
    GREEN("Зеленый");

    private String description;

    Color (String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

