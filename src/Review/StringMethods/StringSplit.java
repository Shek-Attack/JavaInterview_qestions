package Review.StringMethods;

public class StringSplit {
    public static void main(String[] args) {

        String str = "Welcome-to-great-land-of-Canada";
       // String str = "Wel-come-to-gr-eat--land-of-Ca-na-da";
        String[] split = str.split("-");

        for(int i =0; i<str.length(); i++){
            System.out.println(split[i] );
        }
    }
}
