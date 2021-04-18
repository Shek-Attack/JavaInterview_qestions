package Review.Page35;

public class removeDuplicates {
    /*
    Write a return method that can remove the duplicate values from String
     Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {

        String str = "AAABBBCCC";
        String result = "";

        for(int i = 0; i<str.length(); i++){
            for(int j = 0; i<str.length(); i++){
                if(str.charAt(i)==str.charAt(j)){
                    result += str.charAt(i);
                    str = str.replaceAll(""+str.charAt(i),"");
                }
            }
            System.out.println(result);

        }


    }
}
