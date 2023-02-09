public class NestedForLoop {
    public static void main(String [] args) {

        /* 
        Write a Java program that will print out the times tables for all numbers between 1 and 12 using nested for loops. 
        Each set of tables should be separated from the next with a row of 5 asterisks, with a space between each *.

        Your output must follow this format, and include up to and including the 12 times tables:

            1 * 0 = 0                                                                      
            1 * 1 = 1                                                                      
            1 * 2 = 2                                                                      
            1 * 3 = 3                                                                      
            1 * 4 = 4                                                                      
            1 * 5 = 5                                                                      
            1 * 6 = 6                                                                      
            1 * 7 = 7                                                                      
            1 * 8 = 8                                                                      
            1 * 9 = 9                                                                      
            1 * 10 = 10                                                                    
            1 * 11 = 11                                                                    
            1 * 12 = 12                                                                    
            * * * * *                                                                      
            2 * 0 = 0                                                                      
            2 * 1 = 2                                                                      
            2 * 2 = 4                                                                      
            2 * 3 = 6                                                                      
            2 * 4 = 8                                                                      
            2 * 5 = 10                                                                      
            2 * 6 = 12                                                                      
            2 * 7 = 14                                                                      
            2 * 8 = 16                                                                      
            2 * 9 = 18
            2 * 10 = 30                                                                      
            2 * 11 = 22                                                                     
            2 * 12 = 24
            * * * * * 
        Note: Don't print the row of asterisks before the first times tables. 
        But you must have the row after the last times tables (i.e. after the 12 times tables). 
        */

        for(int i = 1; i <= 12; i++){
            for(int j = 0; j <= 12; j++){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println("* * * * *");
        } 
    }
}