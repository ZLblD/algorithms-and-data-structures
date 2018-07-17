package ru.geekbrains.Java_Algorithms.Lesson2;

interface Array {

    int getElement(int index);

    void setElement(int value, int index);

    void addElement(int value);

    void display();

    int getSize();

    boolean deleteElement(int value);

    int find(int value);

    void bubbleSort();

    void selectSort();

    void insertSort();

}
