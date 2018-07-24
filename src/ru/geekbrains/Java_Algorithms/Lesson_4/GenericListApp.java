package ru.geekbrains.Java_Algorithms.Lesson_4;

public class GenericListApp {

    public static void main(String[] args) {
        LinkedListParam<String> list = new LinkedListParam<>();
        list.insert("Artem");
        list.insert("Roman");
//        System.out.println(list.find("Artem"));
        list.display();
        LinkedListParam<People> peopleList = new LinkedListParam<>();
        peopleList.insert(new People("Artem", 22));
        peopleList.insert(new People("Roman", 18));
//        System.out.println(peopleList.find(new People("Artem", 22)).toString());
//        peopleList.display();

        peopleList.delete();
        peopleList.delete();

        peopleList.display();
    }
}
