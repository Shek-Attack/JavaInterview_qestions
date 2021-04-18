package Review.page37;

import java.util.Arrays;

public class writeMinNumber {
    /*
    Write a method that can find the minimum number from an int Array
     */
    public static void main(String[] args) {

        int[] arr = {9,7,5,4,3,2,1};
        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){ //
                min = arr[i];
            }
        }

        System.out.println(min);

        System.out.println("====================");

        int[] arr2 = {9,7,5,4,3,2,1};
        Arrays.sort(arr2);
        int min2 = arr2[0];

        System.out.println(min2);
    }
}
