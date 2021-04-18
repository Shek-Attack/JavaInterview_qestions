package Review.StringMethods;

public class ValueOfPractice {
    public static void main(String[] args) {

        int value = 30;
        String s1 = String.valueOf(value);

        System.out.println(s1 + 10);

        System.out.println("=============================");

        boolean b1 = true;
        boolean b2 = false;

        String str1 = String.valueOf(b1);
        String str2 = String.valueOf(b2);

        System.out.println(str1);
        System.out.println(str2);

    }

}
