package org.example;
/*
Задать массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 */

import java.util.Arrays;

public class Lesson1_12 {
    public static void main(String[] args) {
        int [] arg = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arg));
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] < 6)
                arg [i] = arg[i] * 2;

        }
        System.out.println(Arrays.toString(arg));
    }
}
