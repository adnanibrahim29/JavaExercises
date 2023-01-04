package WarmUp;
public class Eircode {
    public static void main(String [] args){
        /* 
        An Eircode is a unique 7-character code consisting of letters and numbers. Each Eircode consists of a 3-character routing key to identify the area and a 4-character unique identifier for each address, for example W23 F854. The routing key is the first three characters of an Eircode. The unique identifier is a group of 4 characters and comes after the routing key.

        You are required to write a program that stores an Eircode in a String called eircode and print out the routing key and the unique identifier of that Eircode.
        It should then determine which area the Eircode belongs to, based on the following routing key values:

        Dunboyne: A86
        Dungarvan: X35
        Edenderry: R45
        Maynooth: W23
        Shannon: V14
        */

        String eircode = "W23F484";
        String key = "";
        String ident = "";
        String area = "";

        key = eircode.substring(0,3);
        ident = eircode.substring(3);
       
        if(key.equals("A86")){
            area = "Dunboyne";
        } else if(key.equals("X35")){
            area = "Dungarvan";
        } else if(key.equals("R45")){
            area = "Edenderry"; 
        } else if(key.equals("W23")){
            area = "Maynooth";
        } else if(key.equals("V14")){
            area = "Shannon";
        } else {
            area = "Other";
        }

        System.out.println("Key: " + key + "-Identifier: " + ident + "-Area: " + area);
    }
}
