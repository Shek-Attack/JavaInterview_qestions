package Java_Review.Page36;

import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters2 {
    public static void main(String[] args) {

        String str="AAABBBCCCDEF";
        String result="";

        for(String each: str.split(""))
            result += ( (Collections.frequency(Arrays.asList(str.split("")),each)) ==1)? each: "";

        System.out.println(result);
    }
}
