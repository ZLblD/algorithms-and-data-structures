package ru.geekbrains.Java1.DZ6;

class Cat extends Animal {


    public Cat(int distance_run, int distance_swim, double height) {
        super(distance_run, distance_swim, height);
    }

    public int getDistance_run() {
        return super.getDistance_run();
    }

    public int getDistance_swim() {
        return super.getDistance_swim();
    }

    public double getHeight() {
        return super.getHeight();
    }

    public boolean run(Cat cat) {

        if (cat.getDistance_run() <= 200) {
            return true;
        } else {
            return false;
        }
    }

    public boolean mega_run(Cat cat) {

        if (cat.getDistance_run() <= 300) {
            return true;
        } else {
            return false;
        }
    }

    public boolean swim(Cat cat) {
        return false;
    }

    public boolean mega_swim(Cat cat) {
        if (cat.getDistance_swim() <= 1) {      // ну хоть метор должен проплыть)
            return true;
        } else {
            return false;
        }
    }


    public boolean jump(Cat cat) {
        if (cat.getHeight() <= 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean maga_jump(Cat cat) {
        if (cat.getHeight() <= 3) {
            return true;
        } else {
            return false;
        }
    }
}
