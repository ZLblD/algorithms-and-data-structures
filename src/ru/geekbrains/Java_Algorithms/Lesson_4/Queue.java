package ru.geekbrains.Java_Algorithms.Lesson_4;

class Queue {

    private LinkedList queue;

    public Queue(){
        queue = new LinkedList();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void insert(String name, int age){
        queue.insertQueue(name, age);
    }

    public String delete() {
        return queue.deleteQueeue();
    }

    public void display() {
        queue.display();
    }

}
