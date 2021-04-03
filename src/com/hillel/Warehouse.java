package com.hillel;

import com.hillel.exceptions.WarehouseIsFullException;

import java.util.Arrays;

public class Warehouse {
    private Box[] storage;
    private int count; //счетчик заполнения скада

    //дефолтный конструктор, если размер склада не задан при создании

    public Warehouse() {
        storage = new Box[10];
    }

    //конструктор класса
    public Warehouse (int countBoxes) {
        storage = new Box[countBoxes];
    }

    public void addBox(Box box) throws WarehouseIsFullException {
        if (count > storage.length - 1){
            throw new WarehouseIsFullException("Склад переполнен");
        }
        storage[count++] = box;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Warehouse{\n");
        for (int i = 0; i < count; i++) {
            result.append("\t")
                    .append((i + 1) + ". ")
                    .append(storage[i].toString())
                    .append("\n");
        }
        result.append("}");

        return result.toString();
    }
}
