package com.hillel;


public class Box {
    //объявление переменных класса
    private int length;
    private int width;
    private int height;

    //конструктор класса
    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }


    //метод получения объема созданной коробки
    public int getCapacity () {
        return this.length * this.width * this.height;

    }

}
