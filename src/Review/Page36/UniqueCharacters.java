package Review.Page36;

import javax.crypto.spec.PSource;

public class UniqueCharacters {
    /*
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */
    public static void main(String[] args) {

        String str = "AAABBBCCCDEF" ;
        // key words/steps: 1) loop through 2) store new elements into new string
        // 3) count char 4) find unique (if statement)

        String result = "";
        for(int i=0; i<str.length(); i++){
            if(str.contains(str.charAt(i) + "" )){
                str = str.replaceAll("" + str.charAt(i) ,"");
            }
        }
        System.out.println(str);
    }

}
