package ru.geekbrains.Java_Algorithms.Lesson_4;

public class LinkIteratorApp {

    public static void main(String[] args) {
        LinkedListInterator list = new LinkedListInterator();

        LinkInterator itr = new LinkInterator(list);

        itr.insertBefore("Nikita", 30);
        itr.deleteCurrent();
        itr.insertAfter("Artem", 20);
        itr.insertAfter("Masha", 10);
        itr.insertAfter("Grisha", 15);
        itr.nextLink();
        itr.insertBefore("Vanya", 21);
        itr.reset();
        itr.insertBefore("Katya", 40);

        System.out.println(itr.atEnd());
        System.out.println(itr.getCurrent().toString());
        list.display();

    }
}
