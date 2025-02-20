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
        int counter = 1;
        int[][] twoMas = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                twoMas[i][j] = counter;
                System.out.println(twoMas[i][j] + " ");
                counter ++;

            }

        }

        }



    }

