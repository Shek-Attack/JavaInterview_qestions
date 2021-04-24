package Java_Review.StringMethods;

public class StringParsing {
    public static void main(String[] args) {

        String tenString = "10";

       // Integer result =20 + tenString;  //This won't work since you can't add an integer and a string

        Integer result = 20 + Integer.parseInt(tenString);

        /*
        Parsing is to read the value of one object to convert it to another type. For example
        you may have a string with a value of "10". Internally that string contains the Unicode
        characters '1' and '0' not the actual number 10. The method Integer.parseInt takes that
        string value and returns a real number.
         */


    }
}
