package Exceptions;

import java.util.NoSuchElementException;

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
public class test extends RuntimeException {

    public static void main(String[] args) {

      //  FileOutputStream file = new FileOutputStream(""); // checked


     //   System.out.println(11/0); // unchecked exception

        System.out.println("Cybertek".charAt(4));  // r
      //  System.out.println("Cybertek".charAt(400)); //IndexOutOfBound Exception (unchecked)

        System.out.println(new int[] {1,2,3}[2]);
     //   System.out.println(new int[] {1,2,3}[20]); //ArrayIndexOutOfBoundsException (unchecked)

        // Throw exception
      //  new IOException(); Object of class

       // throw new IOException(); //checked exception

        throw new test();  // unchecked exception because of RunTimeException

     //   throw new NoSuchElementException(); //unchecked exception
      //  System.out.println("Test"); // any code that is given after "throw"
        //   keyword is unreachable

       // throw new test();  // checked exception  / this must be before NoSuchElementException()
        // otherwise, code line will not be reached.

        // Abduweli cut his hair today.

    }
}
