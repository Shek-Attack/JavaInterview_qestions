package week4;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Map_Min_value {

    public static int minValue( Map<String,Integer> v ) {

        // SortedSet<Integer> sm = new TreeSet<>(map.values() );  //
        TreeSet<Integer> sm = new TreeSet<>(v.values() );  //
        return sm.first( );  // get the first value after sorted
    }

    public static void main(String[] args) {

        TreeSet<Integer> m = new TreeSet<>();
        m.add(34);
        m.add(4);
        m.add(3);
        m.add(2);

        System.out.println(m.first());
    }

}
