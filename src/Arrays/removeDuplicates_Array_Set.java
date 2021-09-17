package Arrays;

import Colllections.SetInterface;

import java.util.HashSet;

public class removeDuplicates_Array_Set {

    public static void removingDuplicatesUsingSet(int arr[]){
        HashSet st = new HashSet<>();
        int len = arr.length;

        for(int i=0; i<=len -1; i++){
            st.add(arr[i]);  // Set only adds unique values
        }
        st.forEach(elem ->System.out.print(elem + " "));
    }

    public static void main(String[] args) {
        int arr[] = {5,1,2,6,4,4,5,6,8,7};

        removingDuplicatesUsingSet(arr);
    }
}
