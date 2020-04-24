package com.carry.全排列.两数之和;

public class SumDemo {

    public static void main(String[] args) {


        int nums[] = {2,7,11,15};
        int[] index = twoSum(nums, 18);


        for (int i = 0; i<index.length; i++) {
            System.out.println(index[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i<nums.length; i++) {
            for (int j =i+1; j<nums.length; j++) {

                if (nums[j] == target-nums[i]) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
