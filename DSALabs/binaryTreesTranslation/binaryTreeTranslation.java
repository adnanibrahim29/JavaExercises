import java.util.*;
import java.nio.file.*;
import java.io.*;

// Define a class for tree nodes, each representing a word and its translation.
class Node {
    String key, value; // English word and its Spanish translation
    int height; // Height of the node within the tree
    Node left, right; // Pointers to left and right child nodes

    // Constructor to initialize a node with a key (word) and value (translation), setting its height to 1.
    Node(String key, String value) {
        this.key = key;
        this.value = value;
        this.height = 1; // New node is initially added at leaf
    }
}

// Unused class definition - can be used for enhanced functionality like returning search results along with subtree heights.
class SearchResult {
    String translation;
    int subtreeHeight;

    SearchResult(String translation, int subtreeHeight) {
        this.translation = translation;
        this.subtreeHeight = subtreeHeight;
    }
}

// implements the tree data structure for word lookup and balance.
class AVLTree {
    Node root; // The root node of tree

    // Helper method to get the height of a node, returning 0 if the node is null.
    int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }

    // Performs a right rotation on the given node to maintain tree balance.
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        // Perform rotation
        x.right = y;
        y.left = T2;
        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x; // Return new root after rotation
    }

    // Performs a left rotation on the given node to maintain tree balance.
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        // Perform rotation
        y.left = x;
        x.right = T2;
        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y; // Return new root after rotation
    }

    // Calculates the balance factor of a node, used to decide on rotations.
    int getBalance(Node N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    // Inserts a new node with the given key and value into the tree.
    Node insert(Node node, String key, String value) {
        // Perform standard BST insert
        if (node == null)
            return (new Node(key, value));
        if (key.compareTo(node.key) < 0)
            node.left = insert(node.left, key, value);
        else if (key.compareTo(node.key) > 0)
            node.right = insert(node.right, key, value);
        else // Duplicate keys not allowed
            return node;

        // Update height of this ancestor node
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Check whether this node became unbalanced
        int balance = getBalance(node);

        // If this node becomes unbalanced, then there are 4 cases
        
        // Left Left Case
        if (balance > 1 && key.compareTo(node.left.key) < 0)
            return rightRotate(node);

        // Right Right Case
        if (balance < -1 && key.compareTo(node.right.key) > 0)
            return leftRotate(node);

        // Left Right Case
        if (balance > 1 && key.compareTo(node.left.key) > 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && key.compareTo(node.right.key) < 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        // Return the (unchanged) node pointer
        return node;
    }

    // Searches for a node by key and returns it.
    Node search(Node root, String key) {
        if (root == null || root.key.equalsIgnoreCase(key))
            return root;
        if (root.key.compareToIgnoreCase(key) > 0)
            return search(root.left, key);
        return search(root.right, key);
    }

    // insert a key-value pair into the AVL tree.
    void insert(String key, String value) {
        root = insert(root, key, value);
    }

    // Translates a sentence word by word using the AVL tree.
    String translate(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder translatedSentence = new StringBuilder();
        for (String word : words) {
            Node result = search(root, word);
            if (result != null)
                translatedSentence.append(result.value).append(" ");
            else
                translatedSentence.append(word).append(": Not Found");
        }
        return translatedSentence.toString().trim();
    }

    // Returns the height.
    int treeHeight() {
        return height(root);
    }
}

public class binaryTreeTranslation {
    public static void main(String[] args) throws IOException {
        AVLTree tree = new AVLTree();
        // Load translations from CSV file and insert them into the AVL tree.
        List<String> lines = Files.readAllLines(Paths.get("EnglishSpanish.csv"));
        for (String line : lines) {
            String[] parts = line.split(",");
            tree.insert(parts[0].trim(), parts[1].trim());
        }

        // Read English text from the user and translate it to Spanish using the AVL tree.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter English text to translate:");
        String englishText = sc.nextLine();
        String spanishTranslation = tree.translate(englishText);
        System.out.println("Spanish Translation: " + spanishTranslation);

        // Display the height.
        System.out.println("Total Tree Height: " + tree.treeHeight());
        sc.close();
    }
}
