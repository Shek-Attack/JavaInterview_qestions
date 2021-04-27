package Exceptions;

import java.util.NoSuchElementException;

public class ExceptionHandling {
    public static void main(String[] args) {

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
            System.out.println("Finally Block");
        }

        System.out.println("Completed");
    }
}
