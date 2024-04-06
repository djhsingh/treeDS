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
      /*  tree.traverseInOrder();
       tree.delete(2);
        tree.traverseInOrder();
        tree.delete(1);
        tree.traverseInOrder();*/
        tree.traversePreOrder();
    }
}