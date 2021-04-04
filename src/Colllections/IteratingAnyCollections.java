package Colllections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollections {
    public static void main(String[] args) {

        Collection<Integer> coll = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,534));
//        coll.add(2);
//        coll.add(3);
//        coll.add(5);
//        coll.add(6);
        System.out.println(coll);

//        for (Integer each: coll) {
//            System.out.println(each);  // but for each loop cannot remove an item
//            if(each>10){               // but for each loop cannot remove an item
//                coll.remove(each);     // but for each loop cannot remove an item
//            }
//        }
        Iterator<Integer> myIter = coll.iterator();

        while (myIter.hasNext()){
            Integer each = myIter.next();
            System.out.print(each + " - ");
            if (each>10){
                myIter.remove();
            }

        }
        System.out.println();
        System.out.println(coll);
        /*
         //hasNext()
        System.out.println(myIter.hasNext());

        //next();
        System.out.println(myIter.next());

        //remove
        myIter.remove();
        System.out.println(coll);

//        while(myIter.hasNext()){
//            if(myIter.next()>5){
//                myIter.remove();
//            }
//        }

         */

    }

}
