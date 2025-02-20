package org.example;
/*
Написать метод, принимающий на вход два аргумента: len и initialValue,
и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
 */

import java.util.Arrays;

public class Lesson1_14 {
    public static void main(String[] args) {
        int len = 10;
        int initialValue = 555;
        int [] mas = new int[len];
        System.out.println("Пустой массив " + Arrays.toString(mas));
        Arrays.fill(mas, initialValue);
        System.out.println("Заполненный массив " + Arrays.toString(mas));


    }
}
