package Java_Review.Page35;

public class removeDuplicates2 {
    public static void main(String[] args) {


        String str2 = "AAABBBCCC";
        String result2 = "";
        for(int i=0; i<str2.length();i++){
            if( !result2.contains("" + str2.charAt(i) ) ){
                result2 += "" + str2.charAt(i);

            }
        }
        System.out.println(result2);
    }
}
