package Java_Interview_Week5;

public class RemoveDuplicates {
     /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */
     public static void main(String[] args) {

     }
     public String removeDup(String str){
         String result = "";

         for( int i = 0; i < str.length(); i++){
             if(!result.contains("" + str.charAt(i))){
                 // all letter that are not contained within Result
                 result += "" + str.charAt(i); // are being added to <result>
             }
         }
         return result;
     }
}
