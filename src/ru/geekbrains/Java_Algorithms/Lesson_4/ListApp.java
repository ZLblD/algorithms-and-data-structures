package ru.geekbrains.Java_Algorithms.Lesson_4;

public class ListApp {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert("Artem", 30);
        list.insert("Misha", 10);
        list.insert("Vova", 5);
        list.insert("Masha", 13);
        list.insertLast("Petya", 25);
        list.display();
        System.out.println("Удаление элементов списка");
        list.delete("Vova");
        list.display();
    }
}
