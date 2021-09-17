package Java_Interview_Week5;

public class Array_FindFirstDuplicatedElement {
    /*
    write a program that can find the first duplicated element from the array
     */

    public static void main(String[] args) {

    }
    public int firstDuplicatedElement(int[] arr) {
       int duplicatedElement = 0;

       for(int each: arr){
           int frequency = 0;

           for (int each2: arr){
               if(each == each2) {
                   frequency ++;
               }
               if (frequency>1){
                   duplicatedElement = each;
                   break;
               }
               }
           }
       return duplicatedElement;
       }
}
