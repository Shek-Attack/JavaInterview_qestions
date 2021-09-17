package JavaWeek1;

import java.util.Scanner;

public class FindUnique {
   /*
    Write a return method that can find the unique characters from the String
    Ex: unique("EEEFFCCDDDTESLA") ==> "TESLA";

      Questions:
        1. what is the data type?
        2. what methods would i need?
        3. How I can prove that it works?


        Key words:
        1. String -> char  ; array
        2. split(); for loop,
        3.counter
        4. a.equals(b)


            */
    public static String isUnique(String str){
        String[] arr = str.split("");
        String unique = "";

        for (int j = 0; j < arr.length; j++) {
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j])) {
                    num++;
                }
            }
            if (num == 1) {
                unique += arr[j];
            }
        }
        return unique;
    }

    public static void main(String[] args) {

        System.out.println(isUnique("EEEFFCCDDDTESLA"));
    }

}
