package Java_Review.JavaCoding;

public class HowManyTimesCharacterIsFound {

    public static void main(String[] args) {

        /*
        Given any String print out how many times each character is found in the String
         */

        String str0="CyberTek";
        int letterCounter=0;
        str0=str0.toLowerCase();
        String usedLetters="";

        for (int i=0; i<str0.length();i++){
            letterCounter=0;
            if(usedLetters.contains(str0.charAt(i)+"")) continue;
       //if we used the letter before it will skip this iterator/loop
            for (int j=0; j<str0.length();j++ ){
                if(str0.charAt(i)==str0.charAt(j)){
                    letterCounter++;
                } }
            System.out.println(str0.charAt(i)+ " = " + letterCounter);
            usedLetters+=str0.charAt(i); //creating a new string from the letters coming outof the loop so
           //we don't count the m again and have the unique letters only
        }

    }

}
