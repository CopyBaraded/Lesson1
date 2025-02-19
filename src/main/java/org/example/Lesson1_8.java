package org.example;
/*
Напишите метод, которому в качестве аргументов передается строка и число,
метод должен отпечатать в консоль указанную строку, указанное количество раз;
 */

public class Lesson1_8 {
    public static void main(String[] args) {
        String s = "Java рулит МИРОМ!";
        short r = 7;
        for (int i = 0; i < r; i++) {
            System.out.println(s);
        }
    }
}
