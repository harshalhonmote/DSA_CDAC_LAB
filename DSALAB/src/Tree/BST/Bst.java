package DSALAB.src.Tree.BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Bst {
    static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private Node root;

    public Bst() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    // iterative
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }
        Node temp = root;
        while (true) {
            if (data < temp.data) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return;
                }
                temp = temp.right;
            }
        }
    }

    // add recursive
    public Node addRec(Node root, int data) {
        // System.out.println("rec");
        if (root == null) {
            return (root = new Node(data));
        }
        if (data < root.data)
            root.left = addRec(root.left, data);
        if (data > root.data)
            root.right = addRec(root.right, data);

        return root;
    }

    // wrapper to recursive function extra security than getRoot();
    public void addRecWrapper(int data) {
        root = addRec(root, data);
    }

    public Node search(Node root, int key) {
        if (root == null)
            return null;

        if (root.data == key)
            return root;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public void searchWrapper(int key) {
        if (search(root, key) != null)
            System.out.println(" Present");
        else
            System.out.println(" Not present");
    }

    // DFS
    public void dfs(Node root) {
        Stack<Node> stk = new Stack<>();
        stk.push(root);
        while (!stk.isEmpty()) {
            Node temp = stk.pop();
            System.out.print(temp.data + " ");

            if (temp.right != null)
                stk.push(temp.right);
            if (temp.left != null)
                stk.push(temp.left);
        }
    }

    public void dfsWrapper() {
        dfs(root);
    }

    public void bfs(Node Root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(Root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null)
                q.offer(temp.left);
            if (temp.right != null)
                q.offer(temp.right);
        }
    }

    public void bfsWrapper() {
        bfs(root);
    }

    public void bfsLevelWisePrint(Node Root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(Root);
        while (!q.isEmpty()) {
            int size = q.size();
            while (size > 0) {
                Node temp = q.poll();
                System.out.print(temp.data + " ");

                if (temp.left != null)
                    q.offer(temp.left);
                if (temp.right != null)
                    q.offer(temp.right);
                size--;
            }
            System.out.println();

        }
    }

    public void bfsLevelWisePrintWrapper() {
        bfsLevelWisePrint(root);
    }

    // inorder
    public void inorder(Node root) {
        // System.out.println("inorder");
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void inorder() {
        inorder(root);
    }

    // inorder
    // iterative----------------------------------------------------------------
    public void inorderIterative1() {
        Stack<Node> s = new Stack<>();
        Node temp = root;
        while (temp != null || !s.isEmpty()) {
            if (temp != null) {
                s.push(temp);
                temp = temp.left;
            } else {
                temp = s.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    public void inorderIterative() {
        Stack<Node> s = new Stack<>();
        Node temp = root;
        while (temp != null || !s.isEmpty()) {
            while (temp != null) {
                s.push(temp);
                temp = temp.left;
            }
            temp = s.pop();
            System.out.print(temp.data + " ");
            temp = temp.right;

        }
    }

    // -----------preorder-------------------------------------------------------------------------
    public void preorder(Node root) {
        // System.out.println("inorder");
        if (root == null)
            return;
        System.out.print(root.data + " ");
        inorder(root.left);
        inorder(root.right);
    }

    public void preorderIterative() {
        Stack<Node> s = new Stack<>();
        Node temp = root;
        s.push(temp);
        while (temp != null || !s.isEmpty()) {
            temp = s.pop();
            System.out.print(temp.data + " ");

            if (temp.right != null)
                s.push(temp.right);
            if (temp.left != null)
                s.push(temp.left);
        }
    }
    // ----------postorder--------------------------------------------------------
  
    public void postorderTraversal() {

        if(root == null)
            return;
        
        Stack<Node> stack = new Stack<Node>();
        // We will have a pointer to the recently popped node
        Node curr = root, prev = null;
        
        while(curr != null || !stack.isEmpty()) {
            // Keep on iterating towards the leftmost node
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            
            // If there is no right child
            // or right child is the one that we recently visited
            // it means we have traversed all the nodes of stack.peek()
            
            if(stack.peek().right == null  || stack.peek().right == prev) {
                // we will update the prev node
                prev = stack.pop();
                System.out.print(prev.data+" ");
            } else {
                // Otherwise we will visit the right child.
                curr = stack.peek().right;
            }
        }  
    }
    // ---------------------------------------------------------------------
    public void deleteNode(int key) {
        Node[] arr = search1(root, null, key);
        Node temp = arr[0], parent = arr[1];
        if (temp == null)
            return;
        // node which both the childs
        if (temp.left != null && temp.right != null) {
            Node pre = temp.left;
            parent = temp;
            while (pre.right != null) {
                parent = pre;
                pre = pre.right;
            }
            temp.data = pre.data;
            temp = pre;
        }

        // Left is NULL of deleted node
        if (temp.left == null) {
            if (temp == root)
                root = temp.right;
            else if (parent.left == temp)
                parent.left = temp.right;
            else
                parent.right = temp.right;
        }
        // right is null of deleted node
        else if (temp.right == null) {
            if (temp == root)
                root = temp.left;
            else if (temp == parent.left)
                parent.left = temp.left;
            else
                parent.right = temp.left;
        }

    }

    public Node[] search1(Node root, Node parent, int key) {
        if (root == null)
            return null;

        if (root.data == key)
            return new Node[] { root, parent };

        if (key < root.data)
            return search1(root.left, root, key);
        else
            return search1(root.right, root, key);
    }

    // ----------------------------------------------------------------------------------------
    public Node deleteRec(Node root, int key) {
        if (root == null)
            return root;
        if (root.data > key)
            root.left = deleteRec(root.left, key);
        else if (root.data < key)
            root.right = deleteRec(root.right, key);
        else {

            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            Node succ = root.right;
            while (succ.left != null) {
                succ = succ.left;
            }
            root.data = succ.data;
            root.right = deleteRec(root.right, succ.data);
        }
        return root;
    }
}
