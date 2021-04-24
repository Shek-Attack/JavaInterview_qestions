package Java_Review.page37;

import java.util.Arrays;

public class sortIntArray {

    public static void main(String[] args) {

        /*
        Write a return method that can sort an int array in Ascending order without using the sort
         method of the Arrays class:
         */
        int[] arr = {1,4,6,433,53,12,4,32,100};

        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
                int temp = 0;
                if(arr[i] < arr[j]){

                    temp = arr[i]; // listing lower numbers first
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
