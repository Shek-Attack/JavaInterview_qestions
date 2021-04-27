package Exceptions;

import java.util.NoSuchElementException;

public class ExceptionHandling {
    public static void main(String[] args) throws Throwable {

        int[] arr = {10,20,30};

        try {
            System.out.println(arr[-5]); // indexOutOfBound
        } catch (ArrayIndexOutOfBoundsException e) {
       // } catch (IndexOutOfBoundsException e) {  // has direct relationship with ArrayIndexOutOfBoundsException
       // } catch (RuntimeException e) {  // parents
            System.out.println(e.getMessage());

        }

        try {
            Thread.sleep(1000);
        }catch(InterruptedException e){

        }

        try {
            System.out.println(7 / 0);
     //  } catch (ArithmeticException e){
        } catch (NoSuchElementException e){
            e.printStackTrace();
            System.exit(0);

        }finally {
            new ExceptionHandling().finalize();

            System.out.println("Finally Block");
        }
        String str;  // no point of saving this string because it is not referencing to any object
        // or not being used. So garbage collector will delete this

        String str1 = null;  // when assigning any data type to null, garbage collector will delete it to save memory.

        System.out.println("Completed");
        // driver = null;  // so that garbage collector collects it and make it ready for next test
    }
}
