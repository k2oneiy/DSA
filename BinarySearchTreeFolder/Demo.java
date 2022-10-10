package BinarySearchTreeFolder;

public class Demo {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(50);
        bst.insert(20);
        bst.insert(70);
        bst.insert(10);
        bst.insert(25);
        bst.insert(60);
        bst.insert(90);
        bst.inOrder(bst.root);

        if(bst.search(bst.root,30)==null)
            System.out.println("Not Found");
        else
            System.out.println("Found");



    }
}
