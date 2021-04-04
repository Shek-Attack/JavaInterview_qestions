package Week3;

public class factorial {

    public static void main(String[] args) {

        factorialNumber(5);
        System.out.println(factorialNumber(5));

    }
    public static int factorialNumber(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
            // 1 = 1 * 1
            // 2 = 2 * 1
            // 6 = 3 * 2
            //24 = 4 * 6
            // 120 = 5 * 24

           // System.out.println(result);
        }
        return result;

       // System.out.println("Factorial numbe of " + n + " is " + fact);

    }
}