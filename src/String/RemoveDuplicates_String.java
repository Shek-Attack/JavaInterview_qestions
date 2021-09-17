package String;
/*
   Write function that can remove the duplicated values from String
           Ex: removeDup("AAABBBCCC") ==> ABC
    */
public class RemoveDuplicates_String {

    public String removeDup(String str){
        String non_dup = "";

        for(int i=0; i<=str.length(); i++){
            if(!non_dup.contains(str.charAt(i) + "")    ){
                non_dup +=  str.charAt(i);
            }
        }
        return non_dup;

    }

}
