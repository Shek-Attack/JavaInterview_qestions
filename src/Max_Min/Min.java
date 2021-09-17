package Max_Min;

public class Min {

    public int findMin(int[] num){
        int min = Integer.MAX_VALUE;

        for(int each: num){
            if(each < min){
                min = each;
            }
        }
        return  min;
    }
}
