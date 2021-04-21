package JavaWeek1;

public class FrequencyOfCharacters1 {
    public static void main(String[] args) {
  /*
  String -- Frequency of Characters
   Write a return method that can find the frequency of characters
Ex:  Frequency Of Chars("AAABBCDD") ==> A3B2C1D2
         String str = "AAABBCDD";
   */

    }

    public static String frequencyOfChars(String str) {
        String expectedResult = "";
        for(int i = 0; i < str.length(); i++){

            int count = 0;
            for(int j = 0; j< str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            expectedResult += str.charAt(i) + "" + count;
            str = str.replace(str.charAt(i) + "", "");
        }
        return expectedResult;
    }
}
