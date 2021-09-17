package Java_Interview_Week5;

public class StringRevers {
    /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */
    public static void main(String[] args) {
    }

    public String StringReverse(String str){
        String reverse = "";
        for(int i = str.length()-1; i>=0; i--){

            reverse += str.toCharArray()[i];// because chars needed to be turned into Arrays
        }
        return reverse;
    }
}
