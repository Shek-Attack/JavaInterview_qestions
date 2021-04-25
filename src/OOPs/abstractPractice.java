package OOPs;

abstract class Animal{ // abstract class
    public abstract void animalSound(); // Abstract class does not have body

    public void sleep(){  // regular method
        System.out.println("Zzzzzzzzzz");
    }
}

class Cat extends Animal {   // subclass (inherit from Animal)

    public void animalSound(){ // body of animalSound() is provided here
        System.out.println("The cat says: moewwwwwwwwwwwwwwwwww");

    }
}



public class abstractPractice {
    public static void main(String[] args) {
        Cat cat = new Cat(); // creating cat class
        cat.animalSound();
        cat.sleep();

    }

}
