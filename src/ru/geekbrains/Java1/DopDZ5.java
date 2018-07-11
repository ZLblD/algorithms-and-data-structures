package ru.geekbrains.Java1;



public class DopDZ5 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(0, 0, 12);
        Circle circle2 = new Circle(3, 5, 11);

        System.out.println(circle1.area(circle1.getRadius()));
        System.out.println(circle2.area(circle2.getRadius()));

        comparisonArea(circle1, circle2);
    }


    public static void comparisonArea(Circle circle1, Circle circle2){

        if (circle1.area(circle1.getRadius()) == circle2.area(circle2.getRadius())){
            System.out.println("Площади окружностей равны");
        } else {
            System.out.println("Площади окружностей не равны");
        }
    }

    /**
     * понятно что две окружности пересекаются, если расстояние между их центрами меньше суммы их радиусов
     */
}
