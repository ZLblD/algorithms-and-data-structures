package ru.geekbrains.Java_Algorithms.Lesson_4;

class LinkedListParam<T> {
    private LinkParam<T> first;

    public LinkedListParam() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(T link) {
        LinkParam<T> l = new LinkParam<>(link);
        l.setNext(first);
        this.first = l;
    }

    public LinkParam<T> delete() {
        LinkParam<T> temp = first;
        first = first.getNext();
        return temp;
    }

    public void display() {
        LinkParam<T> current = first;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public T find(T searchNode) {
        LinkParam<T> findNode = new LinkParam<>(searchNode);
        LinkParam<T> current = first;
        while (current != null) {
            if (current.getValue().equals(findNode.getValue())) {
                return findNode.getValue();
            }
            current = current.getNext();
        }
        return null;
    }
}


