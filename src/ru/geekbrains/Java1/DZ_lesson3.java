package ru.geekbrains.Java1;

import java.util.Scanner;

/**
 * 1. Написать программу, которая загадывает случайное число от 0 до 9,
 * и пользователю дается 3 попытки угадать это число.
 * При каждой попытке компьютер должен сообщить больше ли
 * указанное пользователем число чем загаданное, или меньше.
 * После победы или проигрыша выводится запрос –
 * «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)
 */

class DZ_lesson3 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean b = false;
        do {

            System.out.println("Ваша задача угадать число");
            int number = (int) (Math.random() * 10);
            for (int i = 1, j = 3; i <= 3; i++, j--) {
                System.out.println("Угадайте число от 0 до 10, у вас осталось " + j + " попытки");
                int input_number = scanner.nextInt();
                if (input_number == number) {
                    System.out.println("Вы угадали, поздравляем с выигрышем");
                    break;
                } else if (i > 2) {
                    System.out.println("Вы проиграли");
                    break;
                } else if (input_number > number) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                }
            }
            System.out.println("Для продолжения игры нажмите - 1, для завершения - 0 ");
            int cont = scanner.nextInt();
            if (cont == 1){
                b = true;
            } else if(cont == 0){
                b = false;
            }
        } while (b);
        System.out.println("Конец игры");
    }
}
