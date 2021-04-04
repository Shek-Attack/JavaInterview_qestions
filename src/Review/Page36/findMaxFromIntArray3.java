package Review.Page36;

import java.util.Arrays;

public class findMaxFromIntArray3 {

    public static void main(String[] args) {

        int[] arr = {12,33,4,5,6,7,};
        Arrays.sort(arr);

       int max = arr[arr.length-1];

        System.out.println(max);
    }
}
