package Java_Interview_Week5;

public class String_UniqueChar {
    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */
    public static void main(String[] args) {

    }
    public String unique(String str){
        String[] arr = str.split(""); // store all individual chars to < arr >
        String unique1 = ""; // Empty string to store all unique chars

        for (int j = 0; j < arr.length; j++){ // looping individual chars ONCE
            int num = 0; //
            for(int i = 0; i< arr.length; i++){  // looping individual chars TWICE
                if(arr[i].equals(arr[j])){
                    num++;
                }
            }
            if(num == 1){
                unique1 += arr[j];
            }
        }
        return unique1;

    }
}
