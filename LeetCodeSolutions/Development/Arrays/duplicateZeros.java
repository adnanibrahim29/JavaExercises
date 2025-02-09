class duplicateZeros {
    public void duplicatingZeros(int[] arr) {

        int zeros = 0;

        // count the amount of zeros available
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                zeros++;
            }
        }

        // Traversing backwards
        for(int i = arr.length -1; i >= 0; i--){
            if(i + zeros < arr.length){
                arr[i + zeros] = arr[i]; // Shifting elements to its new position
            }

            if(arr[i] == 0){
                zeros--; // Decreasing the amount of zeros
                if(i + zeros < arr.length){
                    arr[i + zeros] = 0; // Duplicating the zeros
                }
            }
        }

    }
}