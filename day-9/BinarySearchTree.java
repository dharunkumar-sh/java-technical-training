public class BinarySearchTree {
    

    //Node class
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert a new node in the binary tree
    Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);
        else if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }
    
    // Inorder traversal of the binary tree
    void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Node root = tree.new Node(10);
        root.left = tree.new Node(20);
        root.right = tree.new Node(30);
        root.left.left = tree.new Node(40);
        root.left.right = tree.new Node(50);
        root.right.left = tree.new Node(60);
        root.right.right = tree.new Node(70);
        tree.insert(root, 25);
        tree.inorder(root);
    }
}
