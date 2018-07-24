package ru.geekbrains.Java_Algorithms.Lesson_4;

class LinkParam<T> {

    private T link;
    private LinkParam<T> next;

    public LinkParam(T link) {
        this.link = link;
    }

    public LinkParam<T> getNext(){
        return next;
    }

    public void setNext(LinkParam<T> next){
        this.next = next;
    }

    public T getValue(){
        return link;
    }



}
