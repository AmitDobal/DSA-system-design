package com.amit.dsa.a1_array_string.b3_remove_duplicates;

public class RemoveDuplicates {
    /**
     * Given a sorted array, remove the duplicates in-place such that each element appears only once and returns the new length.
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     * Space Complexity: O(1)
     * Time Complexity: O(n)
     * @param nums the sorted array
     * @return the new length of the array
     */
    public int removeDuplicates(int[] nums) {
        int p1 = 1;
        int p2 = 1;
        int res = 1;
        int len = nums.length;

        while(p2 < len){
            if(nums[p2] != nums[p2 - 1]){
                nums[p1++] = nums[p2];
                res++;
            }
            p2++;
        }

        return res;
    }
}
