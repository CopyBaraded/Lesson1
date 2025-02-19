package org.example;
/*
Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 */

public class Lesson1_6 {
    public static void main(String[] args) {
        watNum();

    }
    public static void watNum(){
        int a = -99;
        if (a >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }

    ;
}
