package Review.Page32;

import java.util.Locale;

/*
Given any String print out how many times each character is found in the String
 */
public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "Cybertekkkkkkk";

        // count; add ; lowercase; loop;
        int letterCount = 0;
      //  int letterCount;
        str = str.toLowerCase();
        String usedLetters = "";

        for(int i=0; i<str.length(); i++){
            letterCount = 0;
            if(usedLetters.contains(str.charAt(i) + ""))
                continue;
            //if we used the letter before it will skip this iterator/loop

            for(int j= 0; j <str.length(); j++){
                if(str.charAt(i) == str.charAt(j) ) {
                    letterCount ++;
                }
            }
            System.out.println(str.charAt(i) + " = " + letterCount);

            usedLetters += str.charAt(i);

            //creatinganewstringfromtheletterscomingoutof theloopso
           //wedon'tcountthemagainandhavetheuniquelettersonly
        }

    }
}
