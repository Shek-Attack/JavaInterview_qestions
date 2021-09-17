package parseMethod;

public class StrigToInteger {
    public static void main(String[] args) {

        String str ="123";

        int number = Integer.parseInt(str);
        System.out.println(number);

        System.out.println("================");
        String str2 ="123";
        int number2 = Integer.valueOf(str2);
        System.out.println(number2);

        System.out.println("=================");
        String str3 = "123Shek";
        int number3 = Integer.valueOf(str3);
        System.out.println(number3);

        System.out.println("===============");
        String str4 = "123.00";
        String str5 = "123123";
        System.out.println(isNumuric(str4));
        System.out.println(isNumuric(str5));
    }
    private static boolean isNumuric(String str4){
        return str4 !=null && str4.matches("[0-9.]+");


    }
}
