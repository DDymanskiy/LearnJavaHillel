package com.hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int l = getIntFromConsole(scanner, "Введите длину коробки: ");
        int w = getIntFromConsole(scanner, "Введите длину коробки: ");
        int h = getIntFromConsole(scanner, "Введите длину коробки: ");
        String color = getStringFromConsole(scanner, "Введите цвет коробки: ");
        String fabric = getStringFromConsole(scanner, "Введите материал коробки: ");

        try {
            Box box = new Box(l, w, h, color, fabric);
            System.out.println("Длина созданной коробки: " + box.getLength());
            System.out.println("Ширина созданной коробки: " + box.getWidth());
            System.out.println("Высота созданной коробки: " + box.getHeight());
            System.out.println("Объем созданной коробки: " + box.getCapacity());
            System.out.println("Цвет созданной коробки: " + box.getColor());
            System.out.println("Материал созданной коробки: " + box.getFabric());

            box.setLength(-10);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    //метод получения int из консоли
    public static int getIntFromConsole(Scanner scanner, String text) {
        do {
            System.out.print(text);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Введено неверное число, повторите попытку");
                scanner.nextLine();
            }
        } while (true);
    }

    //метод получения строки из консоли
    public static String getStringFromConsole(Scanner scanner, String text) {
        System.out.print(text);
        return scanner.next();
    }
}
