package Max_Min;

public class Reverse {

    public String reverse(String str){

        String reverse ="";

        for(int i = str.length() -1; i>=0; i--){
            reverse += str.toCharArray()[i];
        }
        return reverse;
    }
}
