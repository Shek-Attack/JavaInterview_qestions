package Colllections;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(); // allow duplicates and has index

        List<Integer> list2 = new LinkedList<>();

        List<Integer>  list3 = new Vector<>(); // thread-safe, thus slower

        Stack<Integer>  list4 = new Stack<>(); //thread-safe; LIFO
        list4.addAll(Arrays.asList(1,2,3,4,5,7));
        list4.pop();

        List<Integer>  list5 = new Stack<>(); //thread-safe; LIFO
        list5.addAll(Arrays.asList(1,2,3,4,5,7));
        ( (Stack)list5).pop();  // downcasting the list to Stack, which allows to use pop();
         // pop();  LIFO - last in first out

        System.out.println(list5); // 7 should be gone because 7 is LIFO

        ((Stack)list5).pop();  // repeating the pop() action
        System.out.println(list5); // deleting 5





    }
}
