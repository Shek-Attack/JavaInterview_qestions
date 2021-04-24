package Java_Review;

public class Review2 {

    class A{

    }
    class C{
        public C(int a){
            System.out.println("C");
        }
    }
    class D extends C{
        public D(){
            super(5);
            System.out.println("D");
        }

        public D(int b){

            this();
            System.out.println("E");

        }
    }



    public static void method1(){ // static method allows to call through class

        }

    public static void method2() {  // non static method, we call through the object
    }


    public static void main(String[] args) {
        new Review2().method1();
        Review2.method1();

        new Review2().method2();


        try{
            throw new RuntimeException();
        }catch ( RuntimeException e){

         // System.exit(0);  exit from the system, otherwise finally block always be running
        }finally {
            System.out.println("Finally");
        }

          String s1 = "";
          String s2 = null;
        System.out.println(s1.length());
       // System.out.println(s2.length());

        String str1 = "A";
        String str2 = "A";
        String str3 = new String("A");

        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); //true

        System.out.println(str1 == str3); // false
        System.out.println(str1.equalsIgnoreCase(str2)); //true




    }
}
