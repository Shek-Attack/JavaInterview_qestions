package Arrays;

public class LoopingArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        for(int i=0; i<arr.length; i++){
            System.out.print("arr[i] = " + arr[i] +"; ");
        }
        System.out.println();
        int[] arr1 ={1,2,3,4,5,6};
        for(int each: arr1){
            System.out.print(each +" ");

        }
    }
}
