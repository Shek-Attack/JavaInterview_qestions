package Arrays;

import java.util.Arrays;

public class removeDuplicate_Array_Sorting2 {
    //function
    public static void removeDup(int arr[]){
        Arrays.sort(arr);
        int len = arr.length;
        int j= 0;

        for(int i=0; i<len-1; i++){
            if(arr[i] != arr[i + 1]){  //5,1
                 arr[j++] += arr[i];
            }
        }
        arr[j++] = arr[len -1];

        for(int k = 0; k < j; k ++){
            System.out.print(arr[k] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = {5,1,2,6,4,4,5,6,8,7};
      //  int[] arr2 ={9,8,7,6,5,4,3,4,5,6,7,6,5};
        removeDup(arr);


    }
}
