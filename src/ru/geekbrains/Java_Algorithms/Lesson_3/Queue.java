package ru.geekbrains.Java_Algorithms.Lesson_3;

interface Queue {

    int remove();

    void insert(int value);

    int peek();

    boolean isEmpty();

    boolean isFull();

    int size();
}
