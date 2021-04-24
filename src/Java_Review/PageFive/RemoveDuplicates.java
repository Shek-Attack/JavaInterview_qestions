package Java_Review.PageFive;

public class RemoveDuplicates {

    public static void main(String[] args) {

        /*
           Write a return method that can remove the duplicate values from String
          Ex: removeDup("AAABBBCCC") ==> ABC
         */
        // Approach One:
        String str = "AAABBBCCC";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    result += str.charAt(i);
                    str = str.replaceAll("" + str.charAt(i), "");
                }
            }
            System.out.println(result);
        }


         //  Approach Two:
              String str1="AAABBBCCC";
               String result1 = "";
            for(int i=0;i<str1.length();i++)


            if (!result1.contains("" + str1.charAt(i)))
                 result1 += "" + str1.charAt(i);
          System.out.println(result1);
             }

             }