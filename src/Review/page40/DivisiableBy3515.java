package Review.page40;

public class DivisiableBy3515 {
    public static void main(String[] args) {
    /*
     if the number can be divisible by 3, 5 and 15, then it should only be displayed in
Divisibel By 15 section
➔ if the number can be divisible by 3 but cannot be divisible by 15,then it should only be
displayed in Divisibel By 3 section
➔ if the number can be divisible by 5 but cannot be divisible by 15,then it should only be
displayed in Divisibel   section
ex:
OutPut:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93
96 99
     */


        String divisableBy15 = "";
        String divisableBy5 = "";
        String divisableBy3 = "";

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) { //0 1 2 3 4 5 6 7 ..........
            arr[i] = i + 1;  // 0+ 1; 1+1, 2+1  ( 1 , 2 , 3)

            for (int each : arr) {
                if (each % 15 == 0 && each % 3 == 0)
                    divisableBy15 += each + " ";
                if (each % 5 == 0 && each % 15 != 0)
                    divisableBy5 += each + " ";
                if (each % 3 == 0 && each % 15 != 0)
                    divisableBy3 += each + " ";
            }

            System.out.println("Divisible By 15" + divisableBy15);
            System.out.println("Divisible By 5" + divisableBy5);
            System.out.println("Divisible By 3" + divisableBy3);


        }
    }

}



