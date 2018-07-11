package ru.geekbrains.Java1;

/**
 * Создайте класс окружностей на плоскости, описав в нём все
 * необходимые свойства, подобрав им понятные имена и правильные типы данных.
 * Опишите в классе конструктор, позволяющий при создании нового объекта явно
 * задать все его свойства. Создайте в классе метод, проверяющий имеют ли две окружности равную площадь.
 * С использованием построенного класса создайте две окружности: одну с центром в (0;0) и радиусом 12,
 * а вторую с центром в (3;5) и радиусом 11. Проверьте с помощью созданного метода равна ли их площадь и если равна,
 * то выведите соответсвующее сообщение на экран. Проверьте пересекаются ли две окружности.
 */

public class Circle {
    private int x, y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area(int getRadius) {
        return (3.14 * getRadius * getRadius);
    }

}
