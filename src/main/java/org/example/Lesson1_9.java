package org.example;
/*
Напишите метод, который определяет, является ли год високосным,
и возвращает boolean (високосный true, не високосный - false).
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й високосный.
 */

public class Lesson1_9 {
    public static void main(String[] args) {
        int god = 1984;
        if (visGod(god))
            System.out.println(god + " год високосный");
        else
            System.out.println(god + " год не високосный");
    }
    public static boolean visGod(int god){
       return (god % 4 == 0 && god % 100 != 0) || (god % 400 == 0);
    }

}
