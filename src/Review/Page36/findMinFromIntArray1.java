package Review.Page36;

public class findMinFromIntArray1 {
    public static void main(String[] args) {

        int[] arr = {9,8,7,6,5,4,1};
        int min = arr[0];
       // int min = 0;  // results 0  - wrong

        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
             min = arr[i];

            }
        }
        System.out.println(min);
    }
}
