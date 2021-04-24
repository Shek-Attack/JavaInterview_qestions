package Java_Review.PageFour;

public class PassportValidation {
    public static void main(String[] args) {

        /*
        Password Validation
      1. Password MUST be at least 8 characters
      2. Password should at least contain one uppercase letter
      3. Password should at least contain one lower case letter
      4. Password should at least contain one special characters
      5. Password should at least contain a  digit
        if all requirements above are met, the password is valid, if not all are met it is invalid
         */

        //Approach One:
        String password = "a?G6jdsaja";
        boolean length = password.length() >= 8;
        boolean lower = password.matches(".*[a-z].*");
        boolean upper = password.matches(".*[A-Z].*");
        boolean number = password.matches(".*[0-9].*");
        boolean special = password.matches(".*[!@.,#$?].*");
        boolean valid = length && lower && upper && number && special;
        if (valid) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Not a valid password");
        }
    }
}
