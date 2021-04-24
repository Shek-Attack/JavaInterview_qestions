package Java_Review;

import java.util.*;

public class review4 {


    public static void main(String[] args) {

        String[] array1 = {"A","B","C"};
        String[] array2 = Arrays.copyOfRange(array1,0,array1.length);

        System.out.println("array1 = "+ Arrays.toString(array1));
        System.out.println("array2 = "+ Arrays.toString(array2));

        System.out.println("==================================");
        if(System.out.printf("Hello").equals("")){

        }
        while(System.out.append("How are you").equals("") ){

        }
        System.out.println();

        System.out.println("==================================");
        int a = 100;
        byte b = (byte)(short) a;

        double c = a;   // implicitly done

        //reference type casting

        Collection<Integer> collection = new ArrayList<>(); // up casting
        List<Integer> list = (List)collection;
       // List<Integer> list = (LinkedList<Integer>)collection; ArrayList and LinkedList does not have IS A relation so don't work

        System.out.println(list);




    }
}
