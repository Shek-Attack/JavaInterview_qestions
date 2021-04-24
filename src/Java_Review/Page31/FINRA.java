package Java_Review.Page31;
/*
Write a program that prints out the numbers from 1 to 30 but for numbers which are a
multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of
5, print "RA" instead of the number. For numbers which are a multiple of both 3 and 5,
print "FINRA" instead of the number.

    Keywords: loop, FIN, += RA, isEmpty , empty string:
 */
public class FINRA {
    public static void main(String[] args) {

        for( int i=1; i<=30;i++){
            String result = ""; //5     15

            if(i% 3 == 0)        //     FIN
                result = "FIN"; // FIN

            if (i % 5 ==0)      //     FIN+RA = FINRA
                result += "RA";  // FIN + RA ; RA ; FINRA

            if (result.isEmpty() ){
                System.out.println(i);
            }else{
                System.out.println(result);
            }

        }
    }
}
