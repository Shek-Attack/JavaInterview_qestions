package Colllections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    /*
     Remove Duplicates From a List Using Plain Java
     int[] arr = {1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8}
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));

        LinkedHashSet hashSet = new LinkedHashSet(list);

        ArrayList<Integer> list1 = new ArrayList<>(hashSet);

        System.out.println(list1);
        System.out.println("===============================================");

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        List<Integer> non_duplicate = list3.stream().distinct().collect(Collectors.toList());

        System.out.println(non_duplicate);
    }
}
