package week4;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Remove_values {
/*
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300};
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for (Integer each : arr) {
            if (each < 100) {
                myList.add(each);
            }
        }
        System.out.println(myList);

        System.out.println("========================");
        /*
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));
        ArrayList<Integer> list2 = new ArrayList<>();
        for (Integer each1 : list1) {
            if (each1 < 100)
                list2.add(each1);
        }
        }
          // list1 = list2;
        System.out.println(list2);

         */

        }
         }



