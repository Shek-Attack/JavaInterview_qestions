package Java_Interview_Week5;

public class Arrays_MergeTwoArrays {
    /*
    Write a return method that can concat two arrays
    int[] arr1 , int[] arr2
     */
    public static void main(String[] args) {
    }

    public int[] concatTwoArrays(int[] arr1, int[] arr2){
    int[] result = new int[arr1.length + arr2.length];

    int i =0;
    for(int each: arr1){
        result[i++] = each;
    }
    for(int each: arr2){
        result[i++] = each;
    }
    return result;
    }
}