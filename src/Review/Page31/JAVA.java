package Review.Page31;



/*
Write a program that will count how many times “java” is found in any given String:
 */
public class JAVA {
    public static void main(String[] args) {
        String givenStr = "Kac defa java geceiyok ki java sayisini javada say";
        int count = 0;

        for(int i = 0; i<givenStr.length()-3; i++){
            if(givenStr.substring(i, i+4).equals("java"))
                count ++;
        }
        System.out.println(count);

    }
}
