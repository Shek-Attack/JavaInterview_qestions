package Java_Interview_Week5;

public class Array_FindMax {
    /*
        Write a function that can find the maximum number from an int Array
        int[] arr = new int[];

        What is integer Maxvalue?
Integer.MAX_VALUE is a constant in the Integer class of java.lang package that specifies
 that stores the maximum possible value for any integer variable in Java. The actual value
 of this is 2^31-1 = 2147483647.
     */
    public static void main(String[] args) {

    }

        public static int findMax(int[] arr){
            int max = Integer.MIN_VALUE;  // max can be any number
            for (int each : arr) {
                if (each > max) {
                    max = each;
                }
            }
            return max;
        }
    }
