package Seminars.Seminar001;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int[] nums = new int[] {2,3,1,1,3,2,2,3};
        int val = 3; 
        int temp;
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == val) {
                    temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
            
        System.out.println(Arrays.toString(nums));
    }
    
}
