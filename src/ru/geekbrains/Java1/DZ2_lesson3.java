package ru.geekbrains.Java1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot",
 * "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
 * "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
 * При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
 * сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
 * apple – загаданное
 * apricot - ответ игрока
 * ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
 * Для сравнения двух слов посимвольно, можно пользоваться:
 * String str = "apple";
 * str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
 * Играем до тех пор, пока игрок не отгадает слово
 * Используем только маленькие буквы
 */

public class DZ2_lesson3 {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};
        System.out.println("Ваша задача угадать слово");
        int pos = random.nextInt(words.length);
        String word = words[pos];           // загадали слово
        System.out.println(word);
        char[] word_ch = word.toCharArray();
        char[] word_prime = Arrays.copyOf(word_ch, 15);
        for (int i = 0; i < word_prime.length; i++) {
            if (word_prime[i] == 0) word_prime[i] = '#';
        }
        System.out.println(Arrays.toString(word_prime));

        while (true) {
            System.out.println("Отгадайте слово");
            String intput_word = scanner.nextLine();
            char[] in_word_ch = intput_word.toCharArray();
            char[] in_word_prime = Arrays.copyOf(in_word_ch, 15);
            for (int i = 0; i < in_word_prime.length; i++) {
                if (word_prime[i] == 0) word_prime[i] = '#';
            }
            System.out.println(Arrays.toString(in_word_prime));

            for (int i = 0; i < word_prime.length; i++) {
                if ( word_prime.equals(in_word_prime) && word_prime[i] == in_word_prime[i] ) {
                    word_prime[i] = in_word_prime[i];
                    System.out.println("Вы выйграли");
                    break;
                } else {
                    word_prime[i] = '#';
                }
                System.out.print(word_prime[i]);
            }
            System.out.println("Поробуйте еще раз");

        }
    }
}

