package page38;

public class ArmstrongNumber {
    public static void main(String[] args) {

    }
    public static boolean isArmStrongNumber(int num){

        String number = String.valueOf(num);
        int multiplier = number.length();
        int sum =0;

        for(int i=0; i<multiplier; i++){
           int digit = Integer.parseInt("" +number.charAt(i));
           sum += Math.pow(digit,multiplier);
        }
        return sum == num;
    }
}
