package OOPs;

class parent{

    void parent_property(){
        System.out.println("Cash + land + gold");
    }
    void marriage(){  // not satisfied
        System.out.println("Arranged Marriage");
    }
}

class child extends parent{  // inheritance
    void parent_property(){
        System.out.println("Cash + land + gold");
    }

   void marriage(){ // overriden method
       System.out.println("Love marriage");  // child can give its own definition
   }
   void child_property(){
       System.out.println("Earned by Child");
   }
}


public class OverrideTesting {

    public static void main(String[] args) {

        child c = new child();  //object creation for child class
        c.marriage();
        c.parent_property();
        c.child_property();




    }

}
