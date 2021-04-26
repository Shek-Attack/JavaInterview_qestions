package Exceptions;

import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/*
  Exceptions:
  1) if compiler could  tell the exception, then it is checked Exception - happening at compile time
        - must be handle immediately or before running the codes
            -otherwise impossible to run the code

            E.G.,  IOException, FileNotFoundException

  2) if compiler could NOT tell the exception, then it is unchecked Exceptions - happening at run time
        - can be handled after running the code
        E.G.,  ArithmeticException,IndexOutofBoundException, NoSuchElementException, NullPointerException
 */
public class Exceptions {

    public static void main(String[] args) {

      //  FileOutputStream file = new FileOutputStream(""); // checked


     //   System.out.println(11/0); // unchecked exception

        System.out.println("Cybertek".charAt(4));  // r
      //  System.out.println("Cybertek".charAt(400)); //IndexOutOfBound Exception (unchecked)

        System.out.println(new int[] {1,2,3}[2]);
     //   System.out.println(new int[] {1,2,3}[20]); //ArrayIndexOutOfBoundsException (unchecked)

    }
}
