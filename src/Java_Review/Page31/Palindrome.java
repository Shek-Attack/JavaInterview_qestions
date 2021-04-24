package Java_Review.Page31;

/*
Given any String determine if it is Palindrome. Print “Palindrome” if it is and “Not Palindrome” if
it is not:
 */
public class Palindrome {
    public static void main(String[] args) {

        String text = "radar";
        boolean chek = true;

        for(int i =0; i< text.length()/2;i++){ //amal
            if(text.charAt(i) != text.charAt(text.length()-1-i)){
                // a m a l                    l a m  a
                chek=false;
                break;
            }
        }
        System.out.println(chek ? "Palindrom" : "Not Palindrome");


    }

}

