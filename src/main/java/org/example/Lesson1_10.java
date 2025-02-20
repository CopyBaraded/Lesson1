package org.example;
/*
Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */

import java.util.Arrays;

public class Lesson1_10 {
    public static void main(String[] args) {
        int[] numb = new int[]{0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1};
        System.out.println("Первоначальный массив " + Arrays.toString(numb));

        reversNumbs(numb);
        System.out.println("Перевернутый массив   " + Arrays.toString(numb));
    }
    public static void reversNumbs(int[] numb){
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] == 0)
                numb[i] = numb[i] + 1;
            else
                numb[i] = numb[i] - 1;

        }
    }
}
