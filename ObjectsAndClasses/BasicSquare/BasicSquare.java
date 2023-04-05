public class BasicSquare{
    
    private int len; // Single Attribute 

    public BasicSquare(){ // Default Constructor
        len = 1;
    }
    public void setLen(int newLen){ // Setter Method
        len = newLen;  // Change the Value of Attributes
    }

    public int getLen(){ // Getter Method
        return len;  // Provides a temp Value
    }
    
    public int getPerimeter(int len){
        int perimeter = (len + len) * 2 ;
        return perimeter;
    }
    public int getArea(int len){
        int Area = len * len;
        return Area;
    }
} 