package Java_Review.StringMethods;

public class StringBuilderPractice {

    public static void main(String[] args) {
        /*

        Is there a way to concatenate char to form a String in Java?
        Example:

          String str;
          Char a, b, c;
          a = 'i';
           b = 'c';
           c = 'e';

          str = a + b + c; // thus str = "ice";
         */

        String str;
        char a, b, c;
        a = 'i';
        b = 'c';
        c = 'u';

       StringBuilder sb = new StringBuilder();
       sb.append(a);
       sb.append(b);
       sb.append(c);

       str = sb.toString();
        System.out.println(str);


    }
}
