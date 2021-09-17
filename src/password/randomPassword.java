package password;

import java.security.SecureRandom;

/*
   Write a method that generates random password which consists of
     a capital letter, lower case letter and a digit.
     "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
     Plan: 1) SecureRandom  2) StringBuilder 3) loop  4) length of password = 5
 */
public class randomPassword {
      public static String generateRandomPassword(int len){
          String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

          SecureRandom random = new SecureRandom();
          StringBuilder sb = new StringBuilder();

          for(int i=0; i<len; i++){  // len = 5
             int randomIndex = random.nextInt(chars.length());
             sb.append(chars.charAt(randomIndex));
          }
          return sb.toString();
      }
    public static void main(String[] args) {
        int len = 5;
        System.out.println("generateRandomPassword(len) = " + generateRandomPassword(len));


    }
}
