package Java_Interview_Week5;

public class StringReverseSecondWord {
    /*
    Reverse the second word ONLY
        Ex:
            Input: I Love Java
            OutPut: I evoL Java
     */
    public static void main(String[] args) {
    }
    public String reverseSecondWord(String sentence){
        String[] words = sentence.split(" ");
        String reversed = "";

        for(int i = words[1].length() - 1; i >=0; i--){
            reversed += words[1].charAt(i);
        }
        words[1] = reversed;
        String result = "";

        for(String each: words){
            result += each + " ";
        }return result.trim();
    }
}
