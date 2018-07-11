package ru.geekbrains.Java1.Lesson7;

import java.util.Arrays;

/**
 * 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)
 * 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
 * 4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
 * 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
 * 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
 */

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

//    public void eat(Plate p) {
//        p.deacreseFood(appetite);
//    }

    public void eat(Plate p) {
        p.deacreseFood(appetite);
        sat(p);

    }

    boolean sat(Plate p) {
        if (p.getFood() >= appetite) {
            return satiety == true;
        } else {
            return satiety == false;
        }
    }

    public void info() {
        System.out.println("Кот наелся или нет = " + satiety);
    }


}

class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void deacreseFood(int n) {
        if (n > food) {
            System.out.println("В тарелке мало еды");
        } else {
            food -= n;
        }
    }

    public void info() {
        System.out.println("plate " + food);
    }
}

class MainClass {
    public static void main(String[] args) {
        Cat[] cat = {new Cat("Barsik", 9, false),
                new Cat("Vaska", 15, false),
                new Cat("Richik", 5, false),
                new Cat("Carapka", 11, false)};


        Plate plate = new Plate(10);

        plate.info();
//        cat.eat(plate);
//        plate.info();
//        cat.info();



        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            cat[i].info();
        }

        plate.setFood(20);
        plate.info();
    }
}



