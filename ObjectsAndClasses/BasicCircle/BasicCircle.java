public class BasicCircle {
    private int radius; // Single Attribute 

    public BasicCircle(){ // Default Constructor
        radius = 1;
    }
    public int getRadius(int rad ){ // Getter Method
        radius = rad;
        return radius;  // Provides a temp Value
    }
    public void setRadius(int rad){ // Setter Method
        radius = rad;  // Change the Value of Attributes
    }
    public double getCircumference(int radius){
        double Circumference = Math.round((2 * Math.PI * radius) * 100.0)/100.0;
        return Circumference;
    }
    public double getArea(int radius){
        double Area = Math.round((Math.PI * radius * radius) * 100.0)/100.0;
        return Area;
    }
} 
