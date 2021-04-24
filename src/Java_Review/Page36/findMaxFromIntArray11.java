package Java_Review.Page36;

public class findMaxFromIntArray11 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 67, 6, 8, 9, 99};
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println(max);

    }
}





