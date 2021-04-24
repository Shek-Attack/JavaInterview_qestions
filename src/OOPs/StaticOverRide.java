package OOPs;

class A{
    public static void staticMethod(){
        System.out.println("printing static method A");

    }
    protected void method1(){
        System.out.println("Printing A method");
        //System.out.println("Print 1 static ");

    }
}

class B extends A{

    public  static void staticMethod(){
        System.out.println("print static method 2");
    }
    @Override
    protected void method1() {
        System.out.println("Printing B method");


    }
}

class C extends B{

    protected void method1(){
        System.out.println("Printing C from method 2");
    }
}

public class StaticOverRide {
    public static void main(String[] args) {
        B b = new B();
        b.method1();

        C c = new C();
        c.method1();

        System.out.println("============================================");

        A.staticMethod(); // call from class name.
        B.staticMethod();// call from class name. Static methods are hidden
        C.staticMethod();


    }
}
