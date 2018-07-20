package ru.geekbrains.Java_Algorithms.Lesson_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Реализация стека");
        StackImpl stack = new StackImpl(10);

//       заполнение стека
        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);

        System.out.println("Извелечение стека");
        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Реализация очереди");
        QueueImpl queue = new QueueImpl(5);
//        заполнение стека
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
//        извлечение 3 элементов
        queue.remove();
        queue.remove();
        queue.remove();
////        вставка новых 4 элементов
        queue.insert(80);
        queue.insert(60);
        queue.insert(70);

        while (!queue.isEmpty()) {
            int value = queue.remove();
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println(" Отражение строки ");
        String input, output;
        while (true) {
            System.out.print("Введите слово - ");
            System.out.flush();
            input = getString(); // чтение строки с клавиатуры
            if (input.equals("")) break; // завершение, если нажаить Enter

            Reverser reverser = new Reverser(input);
            output = reverser.dorev(); // перестановка символов
            System.out.println("Перевернутая строка - " + output);
        }
    }

    public static String getString() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        return s;
    }


}
