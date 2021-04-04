package Week3;

import java.util.*;

public class ArrayList_List {
    public static void main(String[] args) {

        ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        names1.removeAll(Arrays.asList("Ahmed"));

        System.out.println(names1);


    System.out.println("2222222222222222222222222222222");
    List<String> names2 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

      for(ListIterator<String> it = names2.listIterator(); it.hasNext();)
            if(it.next().equals("Ahmed"))
            it.remove();

          System.out.println(names2);




        System.out.println("33333333333333333333333");
    List<String> names3 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

           names3.removeIf(p->p.equals("Ahmed"));

            System.out.println(names3);

             /*
             ArrayList<String> employee = new ArrayList<>(Arrays.asList(arr));
        System.out.println(employee);

        employee.removeIf(p->p.equals("Shek"));
        System.out.println(employee);
              */


        System.out.println("444444444444444444444444444444444");

        List<String> names4 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric"));
        //names4.add("Rana");
                Iterator<String> it = names4.iterator();
                // collections: list, set and queue
                // remove elements while looping through

                while(it.hasNext()) { // checking next element is present
            if(it.next().equals("Ahmed"))
                it.remove();
        }
        System.out.println( names4 );

    }
}
