package org.example;
/*
Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение "Красный",
если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то "Желтый",
если больше 100 (100 исключительно) - "Зеленый";
 */

public class Lesson1_3 {
    public static void main(String[] args) {
        printColor();

    }

    public static void printColor() {
        int z = 145;
        if (z <= 0) {
            System.out.println("Красный");
        } else if (z > 0 && z <= 100) {
            System.out.println("Желтый");
        } else if (z > 100) {
            System.out.println("Зеленый");
        }
    }
}