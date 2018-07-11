package ru.geekbrains.Java1.DZ6;
//dog1.run(150)
class Main {
    public static void main(String[] args) {

        Animal animal = new Animal(100, 200, 2);
        Dog dog1 = new Dog(150, 9, 1);
        Dog dog2 = new Dog(550, 15, 1);
        Cat cat1 = new Cat(100, 0, 2);
        Cat cat2 = new Cat(150, 1,3);

        System.out.println("dog1");
        System.out.println(dog1.run(dog1));
        System.out.println(dog1.swim(dog1));
        System.out.println(dog1.jump(dog1));
        System.out.println();
        System.out.println("dog2");
        System.out.println(dog2.mega_run(dog2));
        System.out.println(dog2.mega_swim(dog2));
        System.out.println(dog2.mega_jump(dog2));
        System.out.println();
        System.out.println("cat1");
        System.out.println(cat1.run(cat1));
        System.out.println(cat1.swim(cat1));
        System.out.println(cat1.jump(cat1));
        System.out.println();
        System.out.println("cat2");
        System.out.println(cat2.mega_run(cat2));
        System.out.println(cat2.mega_swim(cat2));
        System.out.println(cat2.maga_jump(cat2));
    }
}
