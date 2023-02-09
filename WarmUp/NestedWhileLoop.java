public class NestedWhileLoop {
    public static void main(String []args) {

        /*  
        Write a Java program that uses a nested while-loop to print to the screen 
        the following pattern:

        #
        ##
        ###
        ####
        #####
        */
        
        int num = 1;
        while(num <= 5){ // Loop will run until num is less than or equal to 5
            int count = 1;
            while(count <= num){ // Loop will run until the count is less than or equal to num
                System.out.print("#");
                count++;
            }
            System.out.println();
            num++;
        }


    } 
}
