package ru.geekbrains.Java_Algorithms.Lesson_4;

class StackList {

    private LinkedList list;

    public StackList() {
        list = new LinkedList();
    }

    public void push(String name, int age) {
        list.insertLast(name, age);
    }

    public String pop() {
        return list.deleteStack().name;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        list.display();
    }


}
