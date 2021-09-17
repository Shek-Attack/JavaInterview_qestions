package Arrays;

import java.util.HashMap;
import java.util.Map;

public class removeDuplicates_Array_Hashmap {

    public static void removeDuplicateUsingHashMap(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        //print each key
        map.forEach((k, v) -> System.out.print(k + " "));
    }

    public static void main(String[] args) {

        int arr[] = {5,1,2,6,4,4,5,6,8,7};
        removeDuplicateUsingHashMap(arr);
    }
}
