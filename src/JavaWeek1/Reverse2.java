package JavaWeek1;

public class Reverse2 {
    public static void main(String[] args) {

  /*
  String -- Reverse
  Write a return method that can reverse  String
   Ex: Reverse("ABCD"); ==> DCBA
   */
    }
    public static String StrReverse(String str){
        String reverse = "";
        for(int i = str.length()-1; i>=0; i--){
            reverse += str.toCharArray()[i];


        }
        return reverse;

    }
}
