package com.amit.dsa.a1_array_string.b5_MajorityElement;

public class MajorityElement {
    /**
     * Removes duplicates from a sorted array in-place such that each element appears at most twice
     * and returns the new length of the array. The order of the elements is maintained.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * @param nums the sorted array
     * @return the new length of the array
     */
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int el = nums[0];
        int count = 0;

        int p1 = 0;
        int p2 = 0;
        int res = 0;

        while (p2 < len) {
            if (nums[p2] == el)
                count++;
            else {
                count = 1;
                el = nums[p2];
            }

            if (count <= 2) {
                nums[p1++] = nums[p2];
                res++;
            }
            p2++;
        }
        return res;
    }
}
