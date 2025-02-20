package org.example;
/*
Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
то есть [0][0], [1][1], [2][2], ...,. [n][n]
 */

import java.util.Arrays;

public class Lesson1_13 {
    public static void main(String[] args) {

        int[] twoMas [] = new int[10][10];
        for (int [] line : twoMas) {
            for (int item : line) {

                System.out.printf("%d ", item);
            }
            System.out.println();

        }

        }



    }

