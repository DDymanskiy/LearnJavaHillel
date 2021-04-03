package com.hillel;

import com.hillel.exceptions.WarehouseIsFullException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse(3);
        Box box = new Box (1, 1, 1, Fabric.cardboard.getDescription());
        BoxColor boxColor = new BoxColor(1, 1, 1, Fabric.cloth.getDescription(), Color.WHITE.getDescription());

        try {
            warehouse.addBox(box);
            warehouse.addBox(boxColor);
            warehouse.addBox(boxColor);
            warehouse.addBox(box);
        } catch (WarehouseIsFullException e) {
            e.printStackTrace();
        }
        System.out.println(warehouse.toString());

    }

//        Scanner scanner = new Scanner(System.in);
//        int l = getIntFromConsole(scanner, "Введите длину коробки: ");
//        int w = getIntFromConsole(scanner, "Введите длину коробки: ");
//        int h = getIntFromConsole(scanner, "Введите длину коробки: ");
//
//        try {
//            BoxColor box = new BoxColor(l, w, h, Fabric.cardboard.getDescription(), Color.BROWN.getDescription());
//            System.out.println("Длина созданной коробки: " + box.getLength());
//            System.out.println("Ширина созданной коробки: " + box.getWidth());
//            System.out.println("Высота созданной коробки: " + box.getHeight());
//            System.out.println("Объем созданной коробки: " + box.getCapacity());
//            System.out.println("Материал созданной коробки: " + box.getFabric());
//            System.out.println("Цвет созданной коробки: " + box.getColor());
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//
//    }
//    //метод получения int из консоли
//    public static int getIntFromConsole(Scanner scanner, String text) {
//        do {
//            System.out.print(text);
//            if (scanner.hasNextInt()) {
//                return scanner.nextInt();
//            } else {
//                System.out.println("Введено неверное число, повторите попытку");
//                scanner.nextLine();
//            }
//        } while (true);
//    }

}
