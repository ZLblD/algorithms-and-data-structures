package ru.geekbrains.Java1.DZ6;

class Dog extends Animal {

    public Dog(int distance_run, int distance_swim, double height) {
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
    public boolean run(Dog dog) {

        if (dog.getDistance_run() <= 500) {
            return true;
        } else {
            return false;
        }
    }

    public  boolean mega_run(Dog dog){
        if (dog.getDistance_run() <= 600) {
            return true;
        } else {
            return false;
        }
    }

    public boolean swim(Dog dog) {
        if (dog.getDistance_swim() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public boolean mega_swim(Dog dog) {
        if (dog.getDistance_swim() <= 20) {
            return true;
        } else {
            return false;
        }
    }


    public boolean jump(Dog dog) {
        if (dog.getHeight() <= 0.5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean mega_jump(Dog dog) {
        if (dog.getHeight() <= 1.5) {
            return true;
        } else {
            return false;
        }
    }
}

