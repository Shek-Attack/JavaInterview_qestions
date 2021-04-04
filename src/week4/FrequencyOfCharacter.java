package week4;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        Map<Character, Integer> m = new HashMap<>();
        String str = "Spartans";
        for (Character each : str.toCharArray()) {

            if (m.containsKey(each)) {
                m.put(each, m.get(each) + 1);
            } else {
                m.put(each, 1);
            }
        }
        System.out.println(m);
    }

       //////////////////////////////////////////

        public  static  int  minValue( Map<String,Integer>    map  ) {
            SortedSet<Integer> sm = new TreeSet<>(map.values());
            return sm.first( );
        }

    }


