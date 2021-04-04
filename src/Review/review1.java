package Review;

class RemoteWebDriver{

}

class ChromeDriver extends RemoteWebDriver{

}
class FireFoxDriver extends RemoteWebDriver{


}
// No Is A relations between Chrome and FireFox driver
public class review1 {

    static int b;
    int a ; // instance variable out of main method  // default variable

    public void method2(){
        System.out.println(this.b);
        System.out.println(review1.b); // call the static from class name

    }

    public void method(){
        System.out.println(this.a);
        this.method2();

    }
    static {
        System.out.println("Hello");
    }

    public static void main(String[] args) throws InterruptedException {

        RemoteWebDriver driver1 = new ChromeDriver(); //upCasting
       // FireFoxDriver driver2 = (FireFoxDriver) driver1; //downcasting  ; don't work
        ChromeDriver driver2 = (ChromeDriver) driver1; //downcasting ; works because chromrdiver can be casted to ChromeDriver




        int a = 10; // local variable within main method

        System.out.println(a);
        System.out.println(new review1().a); // create object of review class, then able to call instance variable

        String str1 = "Cybertek";
        String str2= new String("Cybertek");

        try{   // why try_catch block is better than throws exceptions?
            throw new RuntimeException();
        }catch (RuntimeException e){

        }
          //throw new InterruptedException();
        String name = "Student";
        name = null;   //NullPointerException
        System.out.println(name.charAt(0));

        /*
        WebDriver driver = new ChromeDriver();
        TakeScreenSHot ts = (TakeScreenShot) driver;
        JavaScriptExecutor js = (JavaScriptExecutor) driver ;
         */

    }
}
