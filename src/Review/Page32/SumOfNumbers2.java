package Review.Page32;

public class SumOfNumbers2 {
    public static void main(String[] args) {

        String str = "jav45ai1000sgre1at82";
        int sum = 0;
        String num = "";

        for(int i = 0; i<str.length(); i++){

            if(Character.isDigit(str.charAt(i))) {
                num += str.charAt(i);

                if(i == str.length() -1 || !Character.isDigit(str.charAt(i))) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        System.out.println(sum);


    }
}
