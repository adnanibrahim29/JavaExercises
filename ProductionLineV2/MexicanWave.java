import java.util.Scanner;
public class MexicanWave {
    public static void main(String[] args) {
        /* 
        The mexican wave is a famous motion that is often perfomed by a crowd at a sporting event. The motion involves an effect resembling a moving
        wave produced by successive sections of the crowd in a stadium standing up, raising their arms, lowering them, and sitting down again.

        Your task for this program is to simulate a "mexican wave" on a String. Within your program, create a method called wave which takes one String 
        as an input. This method should return an array of stages in the wave.

        For example, with the word "hello", your mexican wave will be ["Hello", "hEllo", "heLlo", helLo", hellO"]. When your array has been created,
        print out its contents one word per line.

        NOTE: Spaces are ignored in the mexican wave.

        Sample Input 1
            hello

        Sample Output 1
            Hello
            hEllo
            heLlo
            helLo
            hellO 
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        sc.close();

        System.out.println();

        String[] wave = wave(str);
        for (String word : wave) {
            System.out.println(word);
        }
    }
    public static String[] wave(String str) {
        int len = str.length();
        String[] wave = new String[len];
        for (int i = 0; i < len; i++) {
            char space = str.charAt(i);
            if (space == ' ') {
                continue; // ignore spaces
            }
            String newStr = str.substring(0, i) + Character.toUpperCase(space) + str.substring(i+1) ;
            wave[i] = newStr;
        }
        return wave;
    }
}