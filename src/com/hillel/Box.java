package com.hillel;

import java.util.Scanner;

public class Box {
    //объявление переменных класса
    private int length;
    private int width;
    private int height;
    private String color;
    private String fabric;


    //конструктор класса
    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //обновленный конструктор класса с цветом и материалом
    public Box(int length, int width, int height, String color, String fabric) {
        if (checkBoxParams(length) && checkBoxParams(width) && checkBoxParams(height)) {
            this.length = length;
            this.width = width;
            this.height = height;
        } else {
            //если получили хотя бы одно из отрицательных значений - прерываем создание экземпляра класса
            throw new IllegalArgumentException("Создание елемента класса прервано. Стороны коробки не могут быть отрицательным числом");
        }
        this.color = color;
        this.fabric = fabric;
    }

    //геттеры
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public String getFabric() {
        return fabric;
    }

    //сеттеры
    public void setLength(int length) {
        if (checkBoxParams(length)) {
            this.length = length;
        } else {
            System.out.println("Длина коробки не может быть отрицательным значением");
        }
    }

    public void setWidth(int width) {
        if (checkBoxParams(width)) {
            this.width = width;
        } else {
            System.out.println("Ширина коробки не может быть отрицательным значением");
        }
    }

    public void setHeight(int height) {
        if (checkBoxParams(height)) {
            this.height = height;
        } else {
            System.out.println("Высота коробки не может быть отрицательным значением");
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    //метод получения объема созданной коробки
    public int getCapacity() {
        return this.length * this.width * this.height;
    }

    private Boolean checkBoxParams(int boxParam) {
        return boxParam > 0;
    }

}
