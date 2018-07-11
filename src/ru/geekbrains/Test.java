package ru.geekbrains;

import java.util.Arrays;

public class Test {
    //  str.charAt(0);
    public static void main(String[] args) {
        String str1 = "pea";
        String str2 = "potato";
        char[] chars1 = str1.toCharArray();
        char[] prime = Arrays.copyOf(chars1, 15);
        System.out.println(Arrays.toString(prime));

        for (int i = 0; i < prime.length; i++) {
            if (prime[i]== 0) prime[i] = '#';
        }
        System.out.println(Arrays.toString(prime));
        char[] chars2 = str2.toCharArray();
        char[] prime2 = Arrays.copyOf(chars2, 15);
        System.out.println(chars1);
        System.out.println(chars2);
        for (int i = 0; i < prime.length; i++) {
            if (prime[i] == prime2[i]) {
                prime[i] = prime2[i];
            } else {
                prime[i] = '#';
            }
            System.out.print(prime[i]);
        }
        System.out.println();
        System.out.println(prime);
    }
}
