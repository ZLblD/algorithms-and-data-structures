package ru.geekbrains.Java1.DZ6;

/**
 * 1. Создать классы Собака и Кот с наследованием от класса Животное.
 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
 4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
 5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
 */

 class Animal {

    private int distance_run;
    private int distance_swim;
    private double height;

    public Animal(int distance_run, int distance_swim, double height) {
        this.distance_run = distance_run;
        this.distance_swim = distance_swim;
        this.height = height;
    }
    public int getDistance_run() {
        return distance_run;
    }
    public void setDistance_run(int distance_run) {
        this.distance_run = distance_run;
    }
    public int getDistance_swim() {
        return distance_swim;
    }
    public void setDistance_swim(int distance_swim) {
        this.distance_swim = distance_swim;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public boolean run(){
    return false;
    }
    public  boolean swim(){
        return false;
    }
    public  boolean jump(){
        return false;
    }
}
