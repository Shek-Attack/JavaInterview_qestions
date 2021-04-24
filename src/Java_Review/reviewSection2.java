package Java_Review;

import java.util.Arrays;

public class reviewSection2 {

    interface A1{

    }
    interface B1{

    }

    public class Review3 implements A1,B1{
    }

        public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        //    arr[2] = 3; //ArrayIndexOutOfBoundsException

            System.out.println(Arrays.toString(arr));

            int[] a1 = {1,2,3};
            int[] a2 = {1,3,2};

            Arrays.sort(a1);
            Arrays.sort(a2);

            //System.out.println(a1.equals(a2)); // don't work
            System.out.println( Arrays.equals(a1,a2)); // false  // without soring
            System.out.println( Arrays.equals(a1,a2)); // true  // after soring


    }

}
