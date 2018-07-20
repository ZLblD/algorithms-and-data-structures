package ru.geekbrains.Java_Algorithms.Lesson_3;

class StackImpl implements Stack {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackImpl(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    @Override
    public int pop() {
        return stackArray[top--];
    }

    @Override
    public void push(int value) {
        stackArray[++top] = value;
    }

    @Override
    public int peek() {
        return stackArray[top];
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == maxSize - 1);
    }


}
