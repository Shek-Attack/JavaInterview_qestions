package Java_Interview_Week5;

public class Array_MoveAllZerosToTheEnd {
     /*
    write a program that can move all the zeros to the end of an array
     */
     public static void main(String[] args) {

     }
     public int[] moveZerosToTheEnd(int[] arr){
         int[] result = new int[arr.length];
         int count = 0;

         for(int each: arr){
             if(each !=0)
                 result[count++] = each;
             }

         return result;
     }
}
