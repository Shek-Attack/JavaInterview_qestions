package Review.page40;

public class DivisableByDigits {
    public static void main(String[] args) {

        String divisableBy15 = "";
        String divisableBy5 = "";
        String divisableBy3 = "";

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) { //0 1 2 3 4 5 6 7 ..........
            arr[i] = i + 1;  // 0+ 1; 1+1, 2+1  ( 1 , 2 , 3)

                if (arr[i] % 15 == 0 && arr[i] % 5 == 0)
                    divisableBy15 += arr[i] + " ";
                if (arr[i] % 5 == 0 && arr[i] % 15 != 0)
                    divisableBy5 += arr[i] + " ";
                if (arr[i] % 3 == 0 && arr[i] % 15 != 0)
                    divisableBy3 += arr[i] + " ";
            }

            System.out.println("Divisible By 15: " + divisableBy15);
            System.out.println("Divisible By 5: " + divisableBy5);
            System.out.println("Divisible By 3: " + divisableBy3);


        }
    }


