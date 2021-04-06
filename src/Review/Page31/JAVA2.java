package Review.Page31;



/*
Write a program that will count how many times “java” is found in any given String:
 */
public class JAVA2 {
    public static void main(String[] args) {

        String str = "burada java yazdik ki Java kacta gesiyor bul ve java sayisini yazdir";

        //Approach: 1) count ( int count = 0)
        // 2) loop : for(int i=0; givenStr.length()-3
        int javaCounter = 0;
        str = str.toLowerCase();

        while (str.contains("java")){
            javaCounter ++ ;

            str = str.replaceFirst("java","");  // delete previous part and moves to the rest
            //this will replace java with an empty string and return the remaining str.

        }
        System.out.println(javaCounter);
    }
}
