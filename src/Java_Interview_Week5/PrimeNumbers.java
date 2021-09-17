package Java_Interview_Week5;

public class PrimeNumbers {
     /*
        Write a method that can check if a number is prime or not
     */
     public static void main(String[] args) {

     }
     public boolean primeNumber(int num){
         if(num <2 ){
             return false;
         }
         for(int i = 2; i<num; i++){  // i = 2 3 4 4 5 6 7 8 9
             if(num % i == 0){
                 return false;
             }
         }
         return true;
     }
}
