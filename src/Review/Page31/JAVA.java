package Review.Page31;



/*
Write a program that will count how many times “java” is found in any given String:
Keyword: string with value; counter; length() - 3; loop, print

String givenStr = "Kac defa java geceiyok ki java sayisini javada say";

 */
public class JAVA {
    public static void main(String[] args) {
        String givenStr = "Kac defa java geceiyok ki java sayisini javada javajava say";
        int count = 0;

        for(int i = 0; i<givenStr.length()-3; i++){ // kacd acde cdef defa
          //  if(givenStr.substring(i, i+4).equals("java")) // java   i, i +4;  i =0; (0, 0+4)
                if(givenStr.substring(i, i+4).contains("java")) // java   i, i +4;  i =0; (0, 0+4)
                count ++;
        }
        System.out.println(count);
       // javaa    = java
    }
}

