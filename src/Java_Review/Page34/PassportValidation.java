package Java_Review.Page34;

public class PassportValidation {
/*
 Password Validation
1. Password MUST be at least 8 characters
2. Password should at least contain one uppercase letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the password is valid, if not all are met it is invalid
 */
    public static void main(String[] args) {
        String password = "a?G6jdsaja";
      //  String password = "a?G6jdsajaA";

        boolean length = password.length() >=8;
        boolean upper = password.matches(".*[A-Z].*");
        boolean lower = password.matches(".*[a-z].*");
        boolean special = password.matches(".*[!@#$%?,.^].*");
        boolean digit = password.matches(".*[0-9].*");

        boolean valid = length && upper && lower && special && digit;
        if(valid){
            System.out.println("Password is valid");
        }else{
            System.out.println("Password is not valid");
        }



    }
}
