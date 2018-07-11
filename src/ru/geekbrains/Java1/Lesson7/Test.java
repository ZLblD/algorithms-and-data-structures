package Lesson_7;

public class Test {



//-------------------------------------
//    public static void main(String[] args) {
//        Integer a1 = 50;
//        Integer a2 = 50;
//        Integer b1 = 500;
//        Integer b2 = 500;
//        System.out.println(a1==a2);
//        System.out.println(b1==b2);
//    }
//-------------------------------------




















//-------------------------------------
//    public static void main(String[] args) {
//        String str1 = "Hello";
//        String str2 = "Hello";
//        System.out.println(str1 == str2);
//
//
//        String str3 = "Hell";
//        String str4 = str3 + "o";
//        String str5 = "Hello";
//
//        System.out.println(str4 == str5);
//    }
//-------------------------------------




















//-------------------------------------
    public static void main(String[] args) {
        Box box1 = new Box(10, "red");
        Box box2 = new Box(10, "red");
        System.out.println(box1 == box2);
        System.out.println(box1.equals(box2));

    }
//-------------------------------------

}



class Box {
    int weight;
    String color;

    public Box(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }
}
