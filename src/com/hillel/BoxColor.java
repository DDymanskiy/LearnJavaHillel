package com.hillel;

public class BoxColor extends Box {
    private String color;

    public BoxColor(int length, int width, int height, String fabric, String color) {
        super(length, width, height, fabric);//конструктор родительского класса
        this.color = color;//определяем цвет коробки
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "BoxColor{" +
                "length=" + getLength() +
                ", width=" + getCapacity() +
                ", height=" + getHeight() +
                ", fabric='" + getFabric() +
                ", color='" + color + '\'' +
                '}';
    }
}
