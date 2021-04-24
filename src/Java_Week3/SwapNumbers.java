package Java_Week3;

public class SwapNumbers {

    public static void main(String[] args) {
        swap(4,7);
    }

    public static void swap(int a, int b){
        System.out.println("before swap -- a = " + a + ", b = " + b);

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("before swap -- a = " + a + ", b = " + b);
    }
}
