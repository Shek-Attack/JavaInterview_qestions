package Java_Interview_Week5;

import java.util.Arrays;

public class Array_RemoveDuplicates {
    /*
    Write a function that can remove the duplicates from an array of integers
     */
    public static void main(String[] args) {

    }
    // solution 1
    public int[] removeDuplicates(int[] arr){
        return Arrays.stream(arr).distinct().toArray();
        //1.Arrays.stream() to convert string array to stream.
        //2. Java Stream distinct() method returns a new stream of distinct elements.
        // It’s useful in removing duplicate elements from the collection before processing them.

        //solution 2



    }
}
