//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.insert(30);
        bst.insert(40);
        bst.insert(50);

        System.out.println(bst.search(60));


    }
}