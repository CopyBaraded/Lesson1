package org.example;
/*
Напишите метод, который определяет, является ли год високосным,
и возвращает boolean (високосный true, не високосный - false).
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й високосный.
 */

public class Lesson1_9 {
    public static void main(String[] args) {
        int god = 1983;
        short t = 4;
        int visocos = (god % t);
        boolean d = visocos >  0 && (god / 100) != 0;// переписать, что-то не правильно. попробовать через метод
        System.out.println(d);
    }
}
