package WarmUp;

public class Spaces { 
    public static void main(String [] args){

        /* 
        Create a String called addSpaces. Print this String out, adding spaces in between each letter. 
        If there is already a space between 2 letters, another one should NOT be added. 
        */
        String addSpaces = "cup of tea";

        String update = "";

        for(int i = 0; i < addSpaces.length(); i++){ // looping through each character in string 

            char space = addSpaces.charAt(i); // getting the current character 

            if(space != ' '){
                update += space + " "; // Add the character and a space to the update string 
            } else{
                update += space;  // add the space to the result string without adding an extra space 
            }
        }
        System.out.println(update);

    }
}
