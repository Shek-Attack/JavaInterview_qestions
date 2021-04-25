package OOPs;


interface wildAnimal{  //interface  -  the word "interface" replaces "class" word

    public void animalSound(); // interface method (does not have a body)
    public void sleep();  // interface method (does not have a body)

}
class Tiger implements wildAnimal{  // Cat "implements" the Animal interface

    public void animalSound(){
        System.out.println("The Tiger says : Roaringggggggg" ); // interface method (does not have a body)
    }

    public void sleep(){  // The body of sleep() is provided here
        System.out.println("Zzzzzzzzzzzzzz");
    }
  }


public class InterfacePractice {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.animalSound();
        myCat.sleep();

    }
}
