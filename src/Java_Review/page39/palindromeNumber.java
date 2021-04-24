package Java_Review.page39;

public class palindromeNumber {
    public static void main(String[] args) {

        /*
        Create a method that will accept a number (long) and determine if the number is palindrome or
               not.
         */



    }
    public static boolean isDigitPalindrome1(long number){
        long temp = number;
        long reverse = 0;
        int numOfLoops = String.valueOf(number).length();
        String revStr = "";

        for(int i =0; i<numOfLoops; i++){
            reverse += temp%10;
            temp/=10;
        }

        reverse=Integer.parseInt(revStr);
        return reverse == number;

    }


    public static boolean isDigitPalindrome2(long number2){
        String num = String.valueOf(number2); // converting the long into String

      //  String reverse = String.valueOf(new StringBuilder(num).reverse()); // coverting String into Stringbuilder and use revese function
        String reverse = String.valueOf(new StringBuilder(num).reverse());

        long reverseLong = Long.parseLong(reverse); // parsing reverse, meaning converting String into Long

        return reverseLong == number2;
    }

    public static  boolean isDigitPalindrom3(long number3){

        long temp3 = number3;
        long reverseLong = 0;
        long lastDigit;

        while(temp3 !=0){
            lastDigit = temp3 % 10;
            reverseLong = reverseLong*10+lastDigit;
            temp3/=10;
        }
        return reverseLong == number3;
    }
}

