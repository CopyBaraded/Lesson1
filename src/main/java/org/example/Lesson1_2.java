package org.example;
/*
Создайте метод checkSumSign(), в теле которого объявите две int переменные а и b, и инициализируйте
их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные,
и если их сумма больше или равна 0, то вывести в консоль сообщение "Сумма положительная",
в противном случае "Сумма отрицательная";
 */

public class Lesson1_2 {

    public static void main(String[] args) {
        checkSumSign();
    }
    public static void checkSumSign(){
        int a = 5;
        int b = -6;
        int suma = a +b;

        if (suma >= 0){
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательная");

    }
}
