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

        Box box = new Box(l, w, h, color, fabric);




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
        do {
            System.out.print(text);
            String str = scanner.next();
            return str;
        } while (true);
    }
}
