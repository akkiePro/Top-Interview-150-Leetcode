package src.main;

/**
 * https://leetcode.com/problems/remove-element/submissions/1967002102/?envType=study-plan-v2&envId=top-interview-150
 */
public class RemoveElement {
    public static void main(String[] args) {
        int []nums = {3,2,2,3};
        int val = 3;
        int newLength = removeElement(nums, val);
        System.out.println("New length = " + newLength);
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0, numsCounter = 0;
        int []result = nums.clone();
        for(int i=0; i<result.length; i++) {
            if(result[i] == val) {
                count++;
            } else {
                nums[numsCounter] = result[i];
                numsCounter++;
            }
        }
        for (int i: nums)
            System.out.println(i);
        return nums.length - count;
    }
}
