package Colllections;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
         /*
          Set:  NO Duplicates;
          NO index numbers, thus must iterate elements one by one
          Excepts NULL but NO guarantee for insertion order

          */
        String[] companies2 = {"Bank of America", "Bank of America", "Capital one", "Capital one"};

        Set<String> set1= new HashSet<>();
        set1.addAll(Arrays.asList(companies2) );
        set1.addAll(Arrays.asList(null,null) );
        set1.add("A");

        System.out.println(set1);

        System.out.println("===============================");
        String[] companies1 = new String[]{"Bank of America", "Bank of America", "Capital one", "Capital one"};
        Set<String> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(companies1));

        System.out.println(set2);


        System.out.println("=================");
        System.out.println("LinkedHashSet");
        /*
        LinkedHashSet keep the insertion order
         */

        Set<String> set3 = new LinkedHashSet<>();
        set3.addAll(Arrays.asList(companies1));
        set3.addAll(Arrays.asList(null,null));
        set3.add("A");

        System.out.println(set3);


        System.out.println(" TreeSet  - sortttttttttttttttttttt + NO duplicates, Acending order. no null point");
        // NO duplicates, Acednding order

        Set<String> set4 = new TreeSet<>();
        set4.addAll(Arrays.asList("D","C","D","B","A","B","A","E"));
       // set4.add(null);

        System.out.println(set4);





    }
}
