package Arrays;

import java.util.*;

public class RemovingDuplicates_ArrayList_LinkedhashSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2,3,4,5,6,7,7,6,5,4,5,4,6));

        System.out.println(list); // printing array list with duplicates
        // Now let's remove duplicate element without affecting order
        // LinkedHashSet will guaranteed the order and since it's set
        // it will not allow us to insert duplicates.
        // repeated elements will automatically filtered.

        Set<Integer> non_duplicate = new LinkedHashSet<>(list
        );
        // now let's clear the ArrayList so that we can
        // copy all elements from LinkedHashSet
        list.clear();

        //copying element but without any duplicates
        list.addAll(non_duplicate);
        System.out.println(list);
    }
}
