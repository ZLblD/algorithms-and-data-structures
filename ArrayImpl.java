package ru.geekbrains.Java_Algorithms.Lesson_2;

import ru.geekbrains.Java_Algorithms.Lesson_2.Array;

class ArrayImpl implements Array {

    private int currentSize;
    private int[] data;

    public ArrayImpl(int size) {
        this.currentSize = 0;
        this.data = new int[size];
    }

    @Override
    public int getElement(int index) {
        return data[index];
    }

    @Override
    public void setElement(int value, int index) {
        data[index] = value;
    }

    @Override
    public void addElement(int value) {
        data[currentSize] = value;
        currentSize++;
    }

    @Override
    public void display() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println(data[i]);
        }
    }

    @Override
    public int getSize() {
        return currentSize;
    }

    @Override //O(N) линейный поиск
    public int find(int value) {
        int targetIndex = -1;
        for (targetIndex = 0; targetIndex < currentSize; targetIndex++) {
            if (data[targetIndex] == value)
                return targetIndex;
        }
        return -1;
    }

    @Override
    public boolean deleteElement(int value) {
        int targetIndex = find(value);

        if (targetIndex == -1)
            return false;

        for (int i = targetIndex; i < currentSize - 1; i++) {
            data[i] = data[i + 1];
        }
        currentSize--;
        return true;
    }

    @Override
    public void bubbleSort() {
        for (int i = 0; i < currentSize - 1; i++) {
            for (int j = 0; j < currentSize - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    exchange(j, j + 1);
                }
            }
        }
    }

    @Override
    public void selectSort() {
        int minValue, minValueIndex;
        for (int i = 0; i < currentSize - 1; i++) {
            minValueIndex = i;
            for (int j = i + 1; j < currentSize; j++) {
                if (data[j] < data[minValueIndex]) {
                    minValueIndex = j;
                }
            }
            if (minValueIndex != i) {
                exchange(i, minValueIndex);
            }
        }
    }

    @Override
    public void insertSort() {
        for (int i = 1; i < currentSize; i++) {
            int temp = data[i];
            int index = i;
            while (index > 0 && data[index - 1] >= temp) {
                data[index] = data[index - 1];
                --index;
            }
            data[index] = temp;
        }
    }

    private void exchange(int index1, int index2) {
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
}
