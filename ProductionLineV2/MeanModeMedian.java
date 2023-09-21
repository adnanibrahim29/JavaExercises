import java.util.Arrays;

public class MeanModeMedian {
    public static void main(String [] args){
        /* 
        Given an array of numbers, find the mean, mode and median of the array and print them out. 
        The code for the array is given to you, please DO NOT CHANGE THIS.

        The mean is the average. The mode is the most common number in the array. 
        The median is the middle value in the sorted array. If there is no middle value, it is the average 
        of the 2 values either side of the middle. The mean and median should be rounded to 2 decimal places 
        (see appendix)

        Sample Arrays 1
        {1, 4, 3, 9, 3, 6, 8, 5}
        
        Sample Output 1
            mean 4.88
            mode 3
            median 4.5
        
            Appendix:
        In the below example, num1 will have a value of 43.36 after the piece of code is run.

        double num1=Math.round(43.3565656 * 100.0) / 100.0;
        */
        
        //DO NOT CHANGE THE ARRAY DECLARATION
int nums[]={1, 4, 3, 9, 3, 6, 8, 5};

// Calculate the mean
double sum = 0;
for (int i = 0; i < nums.length; i++) {
    sum += nums[i];
}
double mean = sum / nums.length;
mean = Math.round(mean * 100.0) / 100.0;
System.out.println("mean " + mean);

// Calculate the mode
int mode = 0;
int maxCount = 0;
for (int i = 0; i < nums.length; i++) {
    int count = 0;
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] == nums[i]) {
            count++;
        }
    }
    if (count > maxCount) {
        maxCount = count;
        mode = nums[i];
    }
}
System.out.println("mode " + mode);

// Calculate the median
Arrays.sort(nums);
double median;
if (nums.length % 2 == 0) {
    int midIndex1 = nums.length / 2 - 1;
    int midIndex2 = nums.length / 2;
    median = (nums[midIndex1] + nums[midIndex2]) / 2.0;
} else {
    int midIndex = nums.length / 2;
    median = nums[midIndex];
}
median = Math.round(median * 100.0) / 100.0;
System.out.println("median " + median);
    }
}
