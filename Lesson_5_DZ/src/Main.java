import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        Tree tree = new TreeImpl();
//        addNode(tree, 60);
//        addNode(tree, 66);
//        addNode(tree, 25);
//        addNode(tree, 45);
//        addNode(tree, 30);
//        addNode(tree, 55);
//        addNode(tree, 15);
//        addNode(tree, 5);
//        addNode(tree, 20);
//
////        System.out.println(tree.remove(30));
//        System.out.println(tree.remove(45));
//
//        System.out.println("Find 15 = " + tree.find(115));
//
//        tree.traverse(Tree.TraverseMode.PRE_ORDER);
//
//        tree.displayTree();

        Tree[] tree = new TreeImpl[20];
        Random random = new Random();

        for (int i = 0; i < tree.length; i++) {
            tree[i] = new TreeImpl();
            for (int j = 0; j < 15; j++) {
                int randomId = (random.nextInt(40)-20);
                addNode(tree[i], randomId);
            }
            tree[i].displayTree();
        }


    }

    private static void addNode(Tree tree, int id) {
        Person person = new Person("Pavel", id, id);
        tree.insert(person);
    }
}
