package org.example;
/*
Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
 */

public class Lesson1_1 {
    public static void main(String[] args) {
        printThreeWords();
    }
    public static void printThreeWords(){
        String[] words = {"Orange", "Banana", "Apple"};
        for (String word : words) {
            System.out.println(word);
        }
    }

}