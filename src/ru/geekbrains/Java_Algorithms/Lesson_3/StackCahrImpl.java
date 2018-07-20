package ru.geekbrains.Java_Algorithms.Lesson_3;

class StackCahrImpl implements charStack {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackCahrImpl(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    @Override
    public int pop() {
        return stackArray[top--];
    }

    @Override
    public void push(char value) {
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
