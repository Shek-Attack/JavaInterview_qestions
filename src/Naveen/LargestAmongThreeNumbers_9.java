package Naveen;

public class LargestAmongThreeNumbers_9 {
    public static void main(String[] args) {

        int x = 100;
        int y = 200;
        int z = 300;

        if(x > y && x > z){
            System.out.println("X is the largest number");
        }else if(y > z){
            System.out.println("Y is the largest number");
        }else {
            System.out.println("Z is the largest number");
        }
    }
}
