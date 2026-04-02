package src.main;

/**
 * <a href="https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150">MergeSortedArray</a>
 */
public class MergeSortedArray {

    public static void main(String[] args) {
//        int []nums1 = {1,2,3,0,0,0};
//        int []nums1 = {1};
        int []nums1 = {0};
//        int m = 3, n = 3;
//        int m = 1, n = 0;
        int m = 0, n = 1;
//        int []nums2 = {2,5,6};
//        int []nums2 = {};
        int []nums2 = {1};
        merge(nums1, m , nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int counter1 = 0, counter2 = 0;
        int []result = new int[m+n];
        for (int i=0; i<m+n; i++) {
            if (m>counter1 && (n==0 || nums1[counter1] <= nums2[counter2])) {
                result[i] = nums1[counter1];
                counter1++;
            } else {
                result[i] = nums2[counter2];
//                if(n > i) {
                counter2++;
//                }
            }
        }
        nums1 = result;
        System.out.println("Printing result");
        for (int i : nums1) {
            System.out.println(i);
        }
    }

}

// counter1, counter2 = 0;
// i < n
// 3 condition for next increment iterartion loop

// nums1[counter1] <= nums2[counter2] ? result[i] = nums1[counter1]; counter1++;
// nums1[counter1] > nums2[counter2] ? result[i] = nums2[counter2]; if(n>i){counter2++;}
// nums1[counter1] == nums2[counter2] ? result[i] = nums1[counter1]; counter1++;
