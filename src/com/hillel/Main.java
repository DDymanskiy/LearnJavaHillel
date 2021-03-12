package com.hillel;

import java.util.Arrays;
import java.util.SplittableRandom;

public class Main {

    public static void main(String[] args) {
        SplittableRandom sRandom = new SplittableRandom();

        Box[] arrayBoxes = new Box[5];

        for (int i = 0; i < arrayBoxes.length; i++) {
            int[] arrayInts = sRandom.ints(3, 1, 100).toArray();
            arrayBoxes[i] = new Box(arrayInts[0], arrayInts[1], arrayInts[2]);
            System.out.println("Стороны созданной коробки: " + Arrays.toString(arrayInts));
            System.out.println("Объем коробки: " + arrayBoxes[i].getCapacity());
            System.out.println("----------------------------------------");
        }
    }
}
