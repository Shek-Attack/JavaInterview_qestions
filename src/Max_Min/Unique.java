package Max_Min;

public class Unique {

    public String unique_String(String str){
        String[] arr = str.split("");
        String unqiue = "";

        for(int i=0; i<arr.length; i++){
            int num = 0;
            for(int j=0; j< arr.length; j++){
                if(arr[i].equals(arr[j])){
                    num ++;
                }
            }
            if (num == 1) {

                unqiue += arr[i];
            }
        }

        return unqiue;
    }
}
