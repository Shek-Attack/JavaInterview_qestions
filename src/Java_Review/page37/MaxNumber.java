package Java_Review.page37;

import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {

        int[] arr = {9,7,5,4,3,2,1};
        int max = 0;

        for(int i=0; i<arr.length; i++){
            if(max < arr[i] ){
                max = arr[i];
            }
        }
        System.out.println(max);

        System.out.println("======================");
        int[] arr2 = {9,7,5,4,3,2,1};
        Arrays.sort(arr2);

        int max2 =  arr2[arr2.length -1];
        System.out.println(max2);


        System.out.println("===========================");

    }
         public static int maxValue(int[] n){

        int max =Integer.MIN_VALUE;
        for(int each: n)
            if(each > max)
                max = each;

            return max;
         }
}
