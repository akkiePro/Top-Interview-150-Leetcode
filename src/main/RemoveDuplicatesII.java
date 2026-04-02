package src.main;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class RemoveDuplicatesII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3}; // Output: 5, nums = [1,1,2,2,3,_]
        int newLength = removeDuplicates(nums);
        System.out.println("New length = " + newLength);
    }

    public static int removeDuplicates(int[] nums) {
        int numsCounter = 2;
        for(int i=2; i<nums.length; i++) {
            if(nums[numsCounter-2] != nums[i]) {
                nums[numsCounter] = nums[i];
                numsCounter++;
            }
        }
        for (int i: nums)
            System.out.println(i);
        return numsCounter;
    }
}
