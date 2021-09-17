package CastingOrWidening;

public class narrowing {
    public static void main(String[] args) {
        /*
        Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte
         */
     //Narrowing casting must be done manually by placing the type in parentheses
        // in front of the value:
        double myDouble = 10.0;
        int myInt = (int)myDouble; // Manual casting: double to int

        System.out.println(myDouble);
        System.out.println(myInt);


    }
}
