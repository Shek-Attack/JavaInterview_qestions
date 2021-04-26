package OOPs_Concepts;

interface FirstInterface{
    public void myMethod1();
   // public void myMethod2();

}
interface SecondInterface{
    public void myOtherMethod3();
  //  public void myOtherMethod4();

}
class DemoClass implements FirstInterface, SecondInterface{
    public void myMethod1(){
        System.out.println("Trying for the first time");
    }

    public void myOtherMethod3(){
        System.out.println("Trying for the second time");
    }
}

public class multipleInterface {
    public static void main(String[] args) {

        DemoClass myobj = new DemoClass();
        myobj.myMethod1();
        myobj.myOtherMethod3();

    }
}
