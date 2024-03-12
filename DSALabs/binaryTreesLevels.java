import java.util.Scanner;

public class binaryTreesLevels {

    // Node class
    static class Node {
        int value; // Value of the node
        Node left, right; // Left and right children of the node

        // Node constructor
        public Node(int item) {
            value = item;
            left = right = null; // Initialize left and right children as null
        }
    }

    // BinaryTree class
    static class BinaryTree {
        Node root; // Root of the binary tree

        // BinaryTree constructor
        BinaryTree() {
            root = null; // Initialize root as null
        }

        // insert a value into the tree
        void insert(int value) {
            root = insertRec(root, value); // Call the recursive insert method
        }

        // Recursive method to insert a value into the tree
        Node insertRec(Node root, int value) {
            if (root == null) { // If tree is empty, create a new node
                root = new Node(value);
                return root;
            }

            // If the value is less than the root, insert into the left subtree
            if (value < root.value)
                root.left = insertRec(root.left, value);
            // If value is greater than root, insert into the right subtree
            else if (value > root.value)
                root.right = insertRec(root.right, value);

            return root;
        }

        // calculate the depth of the tree
        int calculateDepth() {
            return calculateDepthRec(root); // Call the recursive depth calculation method
        }

        // Recursive method to calculate the depth of the tree
        int calculateDepthRec(Node root) {
            if (root == null) // If the tree is empty, the depth is -1 (Counting from 0)
                return -1; 

            // Calculate the depth of the left and right subtrees
            int leftDepth = calculateDepthRec(root.left);
            int rightDepth = calculateDepthRec(root.right);

            // The depth of the tree is the maximum depth of the subtrees plus 1
            if (leftDepth > rightDepth)
                return (leftDepth + 1); // Add 1 to the depth of the left subtree to include the current node
            else
                return (rightDepth + 1); // Add 1 to the depth of the right subtree to include the current node
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(); // Create a new binary tree

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to insert: ");
        String[] numbers = sc.nextLine().split(","); // Read the numbers to insert separate from ',' is seen

        // Insert each number into the tree
        for (String number : numbers) {
            tree.insert(Integer.parseInt(number.trim())); // .trim() removes any leading or trailing whitespace
        }
        System.out.println("The resulting binary tree has " + tree.calculateDepth() + " levels");

        sc.close(); 
    }
}