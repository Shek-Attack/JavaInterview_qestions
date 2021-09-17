package Lambdaex;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

       // System.out.println(numbers);

       // numbers.forEach( (n) -> {System.out.println(n);});

        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach(method);

    }
}
