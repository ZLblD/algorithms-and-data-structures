package ru.geekbrains.Java_Algorithms.Lesson_4;

class LinkedListInterator {
    private Link first;

    public LinkedListInterator() {
        first = null;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public LinkInterator getIterator() {
        return new LinkInterator(this);
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void display() {
        Link current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }

}
