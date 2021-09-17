package Max_Min;

public class Max {

    public int findMax(int[] num){
        int max = Integer.MIN_VALUE;

        for(int each: num){
            if(each > max){
                max = each;

            }
        }
        return max;
    }
}
