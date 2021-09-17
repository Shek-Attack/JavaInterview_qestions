package Static;

public class static1 {

    static void myStaticMethod(){  //static method
        System.out.println("Static methods can be called without creating objects/instances of class");
    }

    public void myPublicMethod() { //public method
        System.out.println("Public methods must be called by creating objects of class");
    }

    public static void main(String[] args) {
        myStaticMethod(); // call the static method directly without creating the objects
       // myPublicMethod(); // this would create en error. Must create object first to call the public method

        static1 myObj = new static1();
        myObj.myPublicMethod(); // public method must be accessed by creating object of class


    }
}
