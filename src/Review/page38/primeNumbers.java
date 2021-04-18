package Review.page38;

public class primeNumbers {
    public static void main(String[] args) {

        /*
        Create a method that will accept a number and print
         all the prime numbers from  2to that given
           number:
         */

    }

//    public static void printPrimeNums(int num){
//        for(int i=2; i<=num; i++){
//            if(isPrime){
//
//                System.out.println(i);
//
//            }
//        }
        public static boolean isPrime(int num){
            for(int i=2; i<num; i++){
                if(num% i ==0){ // 5
                    return false;
                }
            }
            return true;
        }

    }

