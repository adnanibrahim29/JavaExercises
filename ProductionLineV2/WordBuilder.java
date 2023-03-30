public class WordBuilder {
    public static void main(String [] args){

        /* 
        Given an array of letters and an array of positions, use Bubble sort to sort the arrays to build the word. 
        To find out where you put the letters, you will use the positions contained in the second given array. 
        The code for the arrays is given to you, please DO NOT CHANGE THIS.

        Sample Arrays 1
            letters[] = {'l', 'o', 'e', 'h', 'l'};
            positions[] = {2, 4, 1, 0, 3};

        Sample Output 1
            hello 
        */

        //DO NOT CHANGE THE ARRAY DECLARATIONS
        char letters[]={'l', 'o', 'e', 'h', 'l'};
        int positions[]={2, 4, 1, 0, 3};

        int temp;
        char temp2;
        for(int i = 0; i < positions.length; i++){
            for(int j = 0; j < positions.length-1; j++){
                if(positions[j] > positions[j+1]){
                    temp = positions[j];
                    positions[j] = positions[j+1];
                    positions[j+1] = temp;

                    temp2 = letters[j];
                    letters[j] = letters[j+1];
                    letters[j+1] = temp2;

                }
            }
        }

        System.out.println();
        
        String word = new String(letters);
        System.out.println(word);
    }
}
