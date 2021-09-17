package Palindrome;

public class Palindrome1 {
    public static void main(String[] args) {
       String str = "kayak";
       int len = str.length();
       boolean check = true;

       for(int i=0; i< len - 1; i++){
           if(str.charAt(i) != str.charAt(len - i - 1)){
               // 0 1 2                         last one,last second,last third
               check = false;
               break;
           }
       }
        System.out.println(check ? "Palendrome" : "Not Palandrome");

    }
}
