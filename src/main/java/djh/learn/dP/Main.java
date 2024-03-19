package djh.learn.dP;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Tree tree = new Tree();
       tree.insert(23);
       tree.insert(2);
       tree.insert(34);
       tree.insert(1);
        System.out.println(tree);
        tree.traverseInOrder();
        System.out.println(tree.get(2));
        System.out.println(tree.get(34));
        System.out.println(tree.get(21));
        System.out.println(tree.min());
        System.out.println(tree.max());

    }
}