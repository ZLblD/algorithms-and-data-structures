package ru.geekbrains.Java_Algorithms.Lesson_2;

import ru.geekbrains.Java_Algorithms.Lesson_2.Array;
import ru.geekbrains.Java_Algorithms.Lesson_2.ArrayImpl;

import java.util.Random;

class Main {
    public static void main(String[] args) {

        Array array = new ArrayImpl(5);
//        добавление элементов в массив
        array.addElement(1);
        array.addElement(2);
        array.addElement(3);
        array.addElement(2);
        array.addElement(5);

        System.out.println("Size is " + array.getSize());
        array.display();

//        улдаление в массиве
        System.out.println("Deleting 2");

        boolean needDelete = true;
        while (needDelete) {
            needDelete = array.deleteElement(2);
        }
        array.display();

//        линейный поиск в массиве
        System.out.println("Position of value 3 is " + array.find(3));

//       Создаем массив большого размера и рандомно заполняем его

        Array array1 = new ArrayImpl(10000);
        Array array2 = new ArrayImpl(10000);
        Array array3 = new ArrayImpl(10000);
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            array1.addElement(random.nextInt(500));
            array2.addElement(array1.getElement(i));
            array3.addElement(array1.getElement(i));
        }

        System.out.println("Sort bubble");
        long beforeBubble = System.currentTimeMillis();
        array1.bubbleSort();
        long afterBubble = System.currentTimeMillis();
        long bubble = beforeBubble - afterBubble;
        array1.display();

        System.out.println("Sort select");
        long beforeSelect = System.currentTimeMillis();
        array2.selectSort();
        long afterSelect = System.currentTimeMillis();
        long select = beforeSelect - afterSelect;
        array2.display();

        System.out.println("Sort insert");
        long beforeInsert = System.currentTimeMillis();
        array3.insertSort();
        long afterInsert = System.currentTimeMillis();
        long insert = beforeInsert - afterInsert;
        array3.display();
        System.out.println("Время исполнения пузырьковой сортировки " + bubble + " мс");
        System.out.println("Время исполнения сортировки методом выбора " + select + " мс");
        System.out.println("Время исполнения сортировки методом вставки " + insert + " мс");


    }


}
