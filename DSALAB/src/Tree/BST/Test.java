package DSALAB.src.Tree.BST;

public class Test {
    public static void main(String[] args) {
        Bst b= new Bst();
        b.addRecWrapper(20);
        b.addRecWrapper(10);
        b.addRecWrapper(15);
        // b.addRecWrapper(50);
        // b.addRecWrapper(5);
       // b.preorder(b.getRoot());
       // b.searchWrapper(100);
        System.out.println();
       // b.dfsWrapper();
        System.out.println("-----");
       // b.bfsLevelWisePrintWrapper();
       b.inorder();
       System.out.println();
       //b.inorderIterative();
      // b.inorderIterative1();
       //b.deleteNode(20);
       //b.deleteRec(b.getRoot(), 5);
       //b.inorderIterative1();
       b.postorderTraversal();
    }
}
