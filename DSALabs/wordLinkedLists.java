import java.util.Scanner;

public class wordLinkedLists {
    public static Scanner sc = new Scanner(System.in);
    
    Node head; // head of the linked list
    
    public static void main(String [] args){
        wordLinkedLists myLists = new wordLinkedLists();

        while(true){
            System.out.println("Enter a word: ");
            String word = sc.nextLine();
            if(word.toUpperCase().equals("END")){
                break;
            }
            // Add the entered word to the linked list
            myLists.add(word);
        }

        System.out.println();
        
        Node curNode = myLists.head; // Start from the head of the linked list

        // Print out the words in the linked list
        while(curNode != null){
            System.out.println(curNode.data);
            curNode = curNode.next;
        }
    }

    // Add data to the link list
    public void add(String data){
        // If the linked list is empty, create a new node and make it the head
        if(this.head == null){
            this.head = new Node(data);
        }else { // If the linked list is not empty
            // Create a new node
            Node nodeToAdd = new Node(data);
            // Insert the new node at the beginning of the list
            nodeToAdd.next = this.head;
            this.head = nodeToAdd;
        }
    }
}

// Define the Node class representing each element of the linked list
class Node{
    // Data of the node - the word entered by the user
    String data;
    // Pointer to the next node in the linked list
    Node next;

    // Constructor to initialize the node with data
    Node(String d){this.data = d;}
}
