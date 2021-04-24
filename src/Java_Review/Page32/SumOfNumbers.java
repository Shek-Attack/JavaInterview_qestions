package Java_Review.Page32;

public class SumOfNumbers {
    /*  Createaprogram thatwill takeanyStringandprint the total sum ofall thenumbers inthe
        String.Note:numberscanbemorethandigitsfrom1-9soifyouhave“14”nexttoeachotherit
        should be considered 14 and not 1 and 4 separate:

       */
    public static void main(String[] args) {

    String str = "jav45ai15sgre1at82";
    int sum = 0;
    String num = "";

    for(int i= 0; i< str.length(); i++){
        if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            num += str.charAt(i);

            if(i == str.length()-1 || !(str.charAt(i+1) >= '0' && str.charAt(i+1) <='9')){
                sum += Integer.parseInt(num);
                num = "";

            }
        }
    }
        System.out.println(sum);

    }
}
