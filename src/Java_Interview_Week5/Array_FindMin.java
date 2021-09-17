package Java_Interview_Week5;

public class Array_FindMin {
    /*
    Write a function that can find the maximum number from an int Array
     */
    public static void main(String[] args) {

    }

    public int findMin(int[] arr){

        int Min = Integer.MAX_VALUE;  // this number will be compared to all other elements

        for (int each: arr){
            if (each < Min){
                Min = each;
            }

        }
        return Min;
    }
}
