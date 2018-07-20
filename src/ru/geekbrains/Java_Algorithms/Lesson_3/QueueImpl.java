package ru.geekbrains.Java_Algorithms.Lesson_3;

class QueueImpl implements Queue {

    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int items;


    public QueueImpl(int size) {
        maxSize = size;
        queArray = new int[size];
        front = 0;
        rear = -1;
        items = 0;
    }

    @Override
    public int remove() {
        int temp = queArray[front++];
        if (front == maxSize) front = 0;
        items--;
        return temp;
    }

    @Override
    public void insert(int value) {
        if (rear == maxSize - 1) rear = -1;
        queArray[++rear] = value;
        items++;
    }

    @Override
    public int peek() {
        return queArray[front];
    }

    @Override
    public boolean isEmpty() {
        return (items==0);
    }

    @Override
    public boolean isFull() {
        return (items == maxSize);
    }

    @Override
    public int size() {
        return items;
    }
}
