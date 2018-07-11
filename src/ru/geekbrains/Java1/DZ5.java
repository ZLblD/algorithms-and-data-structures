package ru.geekbrains.Java1;

/**
 * 1.  Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 * 2. Конструктор класса должен заполнять эти поля при создании объекта;
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 * 4. Создать массив из 5 сотрудников
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 */
public class DZ5 {
    public static void main(String[] args) {

        Person[] person = new Person[5];
        person[0] = new Person("Иванов Иван", "разнорабочий", "Ivan@mail.ru", 880070060, 30000, 35);
        person[1] = new Person("Бобров Петр", "водитель", "Ivan@mail.ru", 880070061, 35000, 40);
        person[2] = new Person("Петрова Екатерина", "менеджер", "Ivan@mail.ru", 880070063, 40000, 25);
        person[3] = new Person("Семенов Алексей", "Начальник", "Ivan@mail.ru", 880070064, 60000, 45);
        person[4] = new Person("Потапов Михаил", "Директор", "Ivan@mail.ru", 880070065, 100000, 50);




        for (Person personAge : person) {
            if (personAge.getAge()>40){
                System.out.println(personAge);
            }
        }

        System.out.println(person[2].toString());


    }
}
