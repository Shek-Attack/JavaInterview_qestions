package OOPs;

class A{
    public static void staticMethod(){
        System.out.println("printing static method");

    }
    protected void method1(){
        System.out.println("Printing A method");

    }
}

class B extends A{

    @Override
    protected void method1() {
        System.out.println("Printing B method");

    }
}

public class StaticOverRide {
    public static void main(String[] args) {
        B b = new B();
        b.method1();

        A.staticMethod();
        B.staticMethod();


    }
}
