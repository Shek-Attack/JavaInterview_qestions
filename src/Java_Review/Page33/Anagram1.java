package Java_Review.Page33;

public class Anagram1 {
    /*
    Given two Strings determine if they are Anagrams -> Are built of the same characters:
     */
    public static void main(String[] args) {
        String str1 = "Vali";
        String str2 ="ilav";

        for(int i=0; i<str1.length(); i++){
            str2 = str2.replaceFirst("" + str1.charAt(i),"");
        }
        System.out.println((str2.isEmpty() ? "Anagram" : "Not Anagram"));

    }
}
