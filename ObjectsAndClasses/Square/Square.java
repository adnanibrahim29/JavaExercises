public class Square {
    private int length;

    public Square(){
        length = 1; 
    }
    public Square(int len){
        length = len;
    }
    public int getLen(){
        return length;
    }

    public void setLen(int len){
        length = len;
    }
    public int getArea(){
        return length * length;
    }
    public String toString(){
       String x = "LENGTH: " + length;
       return x;
    }
    
    
}
