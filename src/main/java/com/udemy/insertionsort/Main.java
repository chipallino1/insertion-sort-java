package com.udemy.insertionsort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arrayOfInts = new Random().ints(10, -100, 100).toArray();

        System.out.println(Arrays.toString(arrayOfInts));

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arrayOfInts.length; firstUnsortedIndex++) {
            int newElement = arrayOfInts[firstUnsortedIndex];
            for (int i = firstUnsortedIndex - 1; i >= 0; i--) {
                if (arrayOfInts[i] <= newElement) {
                    arrayOfInts[i + 1] = newElement;
                    break;
                }
                arrayOfInts[i + 1] = arrayOfInts[i];

                if (i == 0) {
                    arrayOfInts[i] = newElement;
                }
            }
        }

        System.out.println(Arrays.toString(arrayOfInts));
    }
}
