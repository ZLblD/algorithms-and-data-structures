package ru.geekbrains;

import java.util.Arrays;


    class Cat {
        private String name;
        private int appetite;
        private boolean satiety;



        public Cat(String name, int appetite, boolean satiety) {
            this.name = name;
            this.appetite = appetite;
            this.satiety = satiety;
        }


// public void eat(Plate p) {
// p.deacreseFood(appetite);
// }



        public void eat(Plate p) {
            if (p.getFood() >= appetite) {
                p.deacreseFood(appetite);
                satiety = true;
            } else {
                satiety = false;
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

            for (int i = 0; i < cat.length; i++) {
                cat[i].eat(plate);
                cat[i].info();
            }
            plate.info();
        }


    }
