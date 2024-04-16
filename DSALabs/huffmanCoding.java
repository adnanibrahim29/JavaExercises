import java.util.*;

public class huffmanCoding {
    public static class Node {
        public char letter = '@'; // stores the letter for this leaf
        public int frequency; // frequency of the character
        public Node leftChild; // this node's left child
        public Node rightChild; // this node's right child

        public Node(char letter, int frequency) {
            this.letter = letter;
            this.frequency = frequency;
        }

        public Node(Node leftChild, Node rightChild) {
            this.leftChild = leftChild;
            this.rightChild = rightChild;
            this.frequency = leftChild.frequency + rightChild.frequency;
        }
    }

    public static class Tree implements Comparable<Tree> {
        public Node root; // first node of tree
        public int frequency; // this is the weighting of the tree

        public Tree(Node root) {
            this.root = root;
            this.frequency = root.frequency;
        }

        @Override
        public int compareTo(Tree other) {
            return this.frequency - other.frequency;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String sentence = scanner.nextLine();

        // Part I: Frequency count using HashMap
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char character : sentence.toCharArray()) {
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
        }

        // Sort characters by frequency in descending order, then alphabetically
        List<Map.Entry<Character, Integer>> frequencyList = new ArrayList<>(frequencyMap.entrySet());
        frequencyList.sort((a, b) -> {
            int frequencyCompare = b.getValue().compareTo(a.getValue());
            if (frequencyCompare != 0) return frequencyCompare;
            return a.getKey().compareTo(b.getKey());
        });

        // Print sorted frequencies
        for (Map.Entry<Character, Integer> entry : frequencyList) {
            System.out.println("'" + entry.getKey() + "' has a frequency of " + entry.getValue());
        }

        // Part II: Building Huffman Tree
        PriorityQueue<Tree> trees = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            trees.offer(new Tree(new Node(entry.getKey(), entry.getValue())));
        }

        while (trees.size() > 1) {
            Tree tree1 = trees.poll();
            Tree tree2 = trees.poll();
            Node parentNode = new Node(tree1.root, tree2.root);
            trees.offer(new Tree(parentNode));
        }

        Tree huffmanTree = trees.poll();

        // Part III: Print Huffman codes if required
        System.out.println("\nHuffman Codes:");
        printCodes(huffmanTree.root, new StringBuilder());
        
        scanner.close();
    }

    private static void printCodes(Node node, StringBuilder prefix) {
        if (node != null) {
            if (node.leftChild == null && node.rightChild == null) {
                System.out.println("'" + node.letter + "' : " + prefix);
            } else {
                printCodes(node.leftChild, new StringBuilder(prefix).append('0'));
                printCodes(node.rightChild, new StringBuilder(prefix).append('1'));
            }
        }
    }
}
