package Java_Review.Page35;

public class UniqueChar {
    /*
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */
    public static void main(String[] args) {
     String str = "AAABBBCCCDEF";
     String result = "";

     for( int i=0;i<str.length(); i++){
         if(str.contains("" + str.charAt(i) ) ){
            str = str.replaceAll("" +str.charAt(i),"");
         }
     }
        System.out.println(str);

    }
}
