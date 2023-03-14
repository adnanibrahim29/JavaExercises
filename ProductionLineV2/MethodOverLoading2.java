import java.util.Scanner;

public class MethodOverLoading2 {
    public static void main(String [] args){

        /* 
        Write a Java program, called MethodOverloading that contains 5 static methods called manipulation(). 
        Each of these methods will take in different parameters as below. They should all return a String and achieve the matching 
        description (see below):

        1) manipulation (String) -> Remove all whitespace from the String.
        2) manipulation (String, char) -> Remove all instances of the given character from the String.
        3) manipulation (String, int) -> Remove all instances in the String of the character from the given index from the String.
        4) manipulation (String, int, int) -> Remove all characters between the given indices (exclusive) from the String.
        5) manipulation (String, char, char) -> Remove all characters between the given characters (exclusive) from the String.
        This should happen between the first instance of the first character and the last instance of the second character in the String 
        and if the characters are the same it should remove everything between the first and last instance of the character.
        6) manipulation (String, char, int) -> Remove all characters from the start of the String up to the xth character given. 
        For example: given manipulation("cuckoo", 'c', 2) the method would remove all characters before the second c that occurs in the 
        string. The output would then be "ckoo".
        
        Each manipulation method should be called from the main method and should work irrespective of case. All output should be printed 
        in lower case. NOTE: Output must match exactly
        
        Input
            n m x x1 c c1 

            where n is the number of words in the string, m is the string, x and x1 are 
            integer values and c and c1 are characters.
        
        NOTE 2: You are given the number of words for a reason, it would be difficult to take input otherwise. 
        You will need to take the String m in word by word.
       
        Sample Input
            6 
            THE CAT SAT ON THE MAT 
            1 
            12 
            a 
            m
        
        Output
            A print statement for each method.
        
            Sample Output
            thecatsatonthemat
            the ct st on the mt 
            te cat sat on te mat 
            thon the mat 
            the camat 
            at sat on the mat  
        */
                
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of words in string: ");
        int num = sc.nextInt();
        String m1 = "";

        System.out.println("Enter the words in the string: ");
        for(int i = 0; i < num; i++) {
            String input = sc.next();
            String in2 = input.toLowerCase() + ' ';
            m1 = m1 + in2;
        }
        String m = m1.substring(0, m1.length() - 1);
        System.out.println("Enter character position you want to remove: ");
        int x = sc.nextInt();
        System.out.println("Enter character position you want to remove between: ");
        int x1 = sc.nextInt();
        System.out.println("Enter what charcter you want to remove: ");
        char c = sc.next().charAt(0);
        System.out.println("Enter upto what index you want to remove: ");
        char c1 = sc.next().charAt(0);
        sc.close();
        
        System.out.println();
        
        System.out.println(manipulation(m));
        System.out.println(manipulation(m, c));
        System.out.println(manipulation(m, x));
        System.out.println(manipulation(m, x, x1));
        System.out.println(manipulation(m, c, c1));
        System.out.println(manipulation(m, c, x));
    }

    public static String manipulation(String m) {
        if (m.length() == 0) {
            return "";
        }
        if (m.length() == 1) {
            return m;
        }
        if (m.charAt(0) == ' ') {
            return manipulation(m.substring(1));
        } else {
            return m.charAt(0) + manipulation(m.substring(1));
        }
    }

    public static String manipulation(String m, char c) {
        if (m.length() == 0) {
            return m;
        }
        if (m.charAt(0) == c) {
            return manipulation(m.substring(1), c);
        } else {
            return m.charAt(0) + manipulation(m.substring(1), c);
        }
    }

    public static String manipulation(String m, int x) {
        if (x < 0 || x >= m.length()) {
            return m;
        }
        String letter = m.substring(x, x + 1);
        String res = m.replace(letter, "");
        return res;
    }

    public static String manipulation(String m, int x, int x1) {
        if (x < 0 || x >= m.length() || x1 < 0 || x1 >= m.length() || x > x1) {
            return m;
        }
        String res = m.substring(0, x + 1) + m.substring(x1);
        return res;
    }

    public static String manipulation(String m, char c, char c1) {
        if (m.indexOf(c) == -1 || m.lastIndexOf(c1) == -1) {
            return m;
        }
        String res = m.substring(0, m.indexOf(c) + 1) + m.substring(m.lastIndexOf(c1));
        return res;
    }

    public static String manipulation(String m, char c, int x) {
        if (x < 1) {
            return m;
        }
        String res = "";
        int count = 0;
        for (int i = 0; i < m.length(); i++) {
            if (m.charAt(i) == c) {
                count++;
                if (count == x) {
                    res = m.substring(i);
                    break;
                }
            }
        }
        return res;
    }
}