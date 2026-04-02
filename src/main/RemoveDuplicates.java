package src.main;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int []nums = {0,0,1,1,1,2,2,3,3,4};
        int newLength = removeDuplicates(nums);
        System.out.println("New length = " + newLength);
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0, numsCounter = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i-1] != nums[i]) {
                nums[numsCounter] = nums[i];
                numsCounter++;
            }
        }
        for (int i: nums)
            System.out.println(i);
        return nums.length - numsCounter;
    }
}
