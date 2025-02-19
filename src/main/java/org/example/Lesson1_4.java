package org.example;
/*
Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
и инициализируйте их любыми значениями, которыми захотите.
Если а больше или равно b, то необходимо вывести в консоль сообщение "а >= b", в противном случае "а < b "
 */

public class Lesson1_4 {
    public static void main(String[] args) {
        compareNumbers();

    }

    public static void compareNumbers() {
        int a = 500;
        int b = 555;
        if (a >= b)
            System.out.println("Переменная a >= переменной b"); //странный результат, неужели нам не интересно больше а или равно :)))
        else
            System.out.println("Вы плохой математик а < b");


    }
}
