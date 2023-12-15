public class queueReader extends FileIO{
    private int maxSize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;
    public static void main(String[] args) {
        
        FileIO reader = new FileIO();
        String[] input = reader.load("queueString.txt");
        queueReader queue = new queueReader(1000);

        for(String processes : input){
            String[] parts = processes.split("\t");

                String commands = parts[0];
                if("REMOVE".equals(commands)){
                    queue.remove();
                }else if("INSERT".equals(commands)){
                    String numbers = parts[1];
                    queue.insert(numbers);
                }
        
        }
        System.out.println(queue.peekFront());
}
    
    public queueReader(int s) { // constructor
        maxSize = s;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public boolean insert(String j) { // put item at rear of queue
        if(isFull()) return false; //don’t remove if full
        if(rear == maxSize-1) // deal with wraparound
            rear = -1;
            rear++;
            queArray[rear] = j; // increment rear and insert
            nItems++; // one more item
        return true; //successfully inserted
    }

    public String remove() { // take item from front of queue
        if(isEmpty()) return null; //don’t remove if empty
            String temp = queArray[front];// get value and incr front
            front++;
        
        if(front == maxSize) // deal with wraparound
            front = 0;
            nItems--; // one less item
            return temp;
    
    }
     
    public String peekFront(){ // peek at front of queue
        return queArray[front];
    }

    public boolean isEmpty() { // true if queue is empty
        return (nItems==0);
    }

    public boolean isFull() { // true if queue is full
        return (nItems==maxSize);
    }

    public int size() { // number of items in queue
        return nItems;
    } 
} 