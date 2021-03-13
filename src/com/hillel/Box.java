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
        this (length, width, height);
        this.color = color;
        this.fabric = fabric;
    }

    //геттеры
    public int getLength () {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    //сеттеры
    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //метод получения объема созданной коробки
    public int getCapacity() {
        return this.length * this.width * this.height;
    }

    private Boolean checkBoxParams (int boxParam) {
        if (boxParam <= 0) {
            System.out.println("Введено отрицательное значение!");
            return false;
        }
        return true;
    }

}
