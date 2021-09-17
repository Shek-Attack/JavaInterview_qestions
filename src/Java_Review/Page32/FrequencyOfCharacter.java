package Java_Review.Page32;

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
            usedLetters += str.charAt(i);
            //if we used the letter before it will skip this iterator/loop

            for(int j= 0; j <str.length(); j++){
                if(str.charAt(i) == str.charAt(j) ) {
                    letterCount ++;
                }
            }
            System.out.println(str.charAt(i) + " = " + letterCount);



            //creating a new string from the letters coming out of the loop so
           //we don't count them again and have the unique letters only
        }

    }
}
