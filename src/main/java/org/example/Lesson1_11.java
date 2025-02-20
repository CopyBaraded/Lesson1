package org.example;
/*
Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 12345678.... 100
 */

import java.util.Arrays;

public class Lesson1_11 {
    public static void main(String[] args) {
        int [] wtf = new int[100];
        System.out.println(Arrays.toString(wtf));
        System.out.println("Длина массивы  " + wtf.length);
        for (int i = 0; i < wtf.length; i++) {
            wtf[i] = i + 1;

        }
        System.out.println( Arrays.toString(wtf));
    }
}
