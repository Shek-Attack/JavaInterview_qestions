package Naveen;

public class VowelAndConsoant_8 {
    public static void main(String[] args) {
        // a i o o u

         char ch = 'g';
//        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
//            System.out.println(ch + " is vowel");
//        }else{
//            System.out.println(ch + " is consonant");
//        }

          switch (ch) {
              case 'a':
              case 'i':
              case 'o':
              case 'u':
              case 'e':
                  System.out.println(ch + " is vowel");
                  break;

              default:
                  System.out.println(ch + " is consonant");
                  break;


          }
    }
}
