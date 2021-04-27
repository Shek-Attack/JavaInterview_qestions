package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

public class ExceptionHandling2 {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        try {
            System.out.println("Cyber".charAt(200));
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        //}catch (IndexOutOfBoundsException e){
        }catch (RuntimeException e){
            e.printStackTrace();
       }
        //catch (IndexOutOfBoundsException e){ // child should be before the parent (RuntimeException is parent)
//            e.printStackTrace();
//        }

        Thread.sleep(2000);
        System.out.println("Completed");

        FileInputStream file = new FileInputStream("");

    }
    public void method1() throws ClassNotFoundException {
        throw  new ClassNotFoundException();
    }

    public void method2(){

        try {
            method1();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
