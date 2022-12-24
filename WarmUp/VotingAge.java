package WarmUp;

public class VotingAge {
    public static void main(String [] args){

        /* Write a Java program that checks to see if the age of a person is 
        greater than or equal to 18. 
        If it is, print out that the person can vote; 
        otherwise, print that they cannot vote. 
        Use an integer variable age to represent the age 
        of the person. */

        int age = 17;

        if(age == 18 || age > 18){
            System.out.println("Person can vote");
        } else{
            System.out.println("Person cannot vote");
        }
    }
}
