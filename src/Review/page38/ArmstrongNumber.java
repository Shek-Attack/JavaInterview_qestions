package Review.page38;

public class ArmstrongNumber {
    public static void main(String[] args) {

    }
    /*
    Create a method that will accept a number and check if the number is an Armstrong number. If
      the number is an Armstrong number return true otherwise return false.
     */
    public static boolean isArmStrongNumber(int num){

        String number = String.valueOf(num); // converting int to String (String.valueOf)
        int multiplier = number.length();  // find the length; if length is 3 digits
        int sum =0;

        for(int i=0; i<multiplier; i++){ // loop the original number
           int digit = Integer.parseInt("" +number.charAt(i));
           sum += Math.pow(digit,multiplier);
        }
        return sum == num;



    }
}
