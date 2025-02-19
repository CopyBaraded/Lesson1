package org.example;
/*
Напишите метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно), если да вернуть true,
в противном случае - false.
 */

public class Lesson1_5 {
    public static void main(String[] args) {
        myNum();
    }
    public static void myNum() {
        short a = 30;
        short b = -20;
        int q = (a + b);
        boolean flag1 = q >= 10 && q <= 20;
        System.out.println(flag1);

    }
}
