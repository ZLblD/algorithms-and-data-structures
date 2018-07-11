package ru.geekbrains.Java1;

/**
 * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 */
class Person {
    private String name;
    private String position;
    private String email;
    private int tel;
    private int salary;
    private int age;



    public Person(String name, String position, String email, int tel, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", tel=" + tel +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }


}
