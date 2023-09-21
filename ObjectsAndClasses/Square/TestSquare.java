public class TestSquare{
    public static void main(String[] args){

        Square [] arr = new Square[4];

        for(int i = 0; i < arr.length; i++){
            arr[i] = new Square();
        }
        arr[0].setLen(10);
        arr[2].setLen(10);

        for(int i = 0; i < arr.length; i++){
            System.out.println("Square " + (i+1) + " has a side length of " + arr[i].getLen());
        }

        for(int i = 0; i < arr.length - 2; i++){
            System.out.println("Square " + (i+1) + " has an area of " + arr[i].getArea());
        }

        System.out.println(arr[2].toString());
    }
}