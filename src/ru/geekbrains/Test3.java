package ru.geekbrains;

import java.util.Arrays;


public class Test3 {
    public static void main(String[] args) {
        reverse();
        System.out.println();
        sort();
        fillDiagonal();


    }
    private static void reverse(){
        /**
         * 1 Нужно распечатать строку в обратном порядке (все элементы должны быть в обратном порядке)
         исходная строка
         job till cocoa pick about shelf stove
         */
        System.out.println("Задание 1 ");
        String str = "job till cocoa pick about shelf stove";
        char[] ch_str = str.toCharArray();
        System.out.println("Исходный массив "+Arrays.toString(ch_str));

        for (int i = 0; i < ch_str.length / 2; i++) {
            char temp = ch_str[i];
            ch_str[i] = ch_str[ch_str.length - 1 - i];
            ch_str[ch_str.length - 1 - i] = temp;
        }
        System.out.println("Перевернутый массив " + Arrays.toString(ch_str));
    }
    private static void sort(){
        /**
         2 Дан массив a = [3, 1, 4, 1, 5, 9, 2, 6]
         нужно отсортировать массив в порядке возрастания
         */
        System.out.println("Задание 2");
        int[] mass = {3, 1, 4, 1, 5, 9, 2, 6};
        System.out.println("Исходный массив " +  Arrays.toString(mass));
        for (int i = 1; i < mass.length; i++) {
            for (int j = mass.length - 1; j >= i; j--) {
                if (mass[j-1] > mass[j]) {
                    int temp = mass[j-1];
                    mass[j-1] = mass[j];
                    mass[j] = temp;
                }
            }
        }
        System.out.println("Отсортированный массив " + Arrays.toString(mass));
    }
    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i == arr.length - j - 1) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}


