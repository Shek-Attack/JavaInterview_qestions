package Palindrome;

public class Palindrome3 {
    public static boolean isPalindrome(char[] word){
        int first = 0;
        int last = word.length -1;
        while(last > first){
            if(word[first] != word[last]){
    return false;
            }
            ++first;
            --last;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "kayak";
        char[] word =  str.toCharArray();
        System.out.println(isPalindrome(word));
    }
}
