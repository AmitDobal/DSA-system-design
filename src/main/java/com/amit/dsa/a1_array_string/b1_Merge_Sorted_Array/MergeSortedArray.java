package com.amit.dsa.a1_array_string.b1_Merge_Sorted_Array;

/**
 * You are given two integer arrays nums1 and nums2,
 * sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function,
 * but instead be stored inside the array nums1. To accommodate this,
 * nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
public class MergeSortedArray {

    /**
     * Merges two sorted integer arrays, nums1 and nums2, into one sorted array in nums1.
     * The merged array is sorted in non-decreasing order.
     * The first m elements of nums1 are the elements to be merged,
     * and the last n elements of nums1 are set to 0 and ignored.
     * nums2 has a length of n.
     * Time Complexity: O(m + n)
     * Space Complexity: O(1)
     *
     * @param nums1 the array to store the merged result
     * @param m     the number of elements in nums1 to be merged
     * @param nums2 the array to be merged
     * @param n     the number of elements in nums2
     */
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int e = nums1.length - 1;
        int p1 = m - 1;
        int p2 = n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] < nums2[p2]) {
                nums1[e--] = nums2[p2--];
            } else {
                nums1[e--] = nums1[p1--];
            }
        }

        while (p1 >= 0) {
            nums1[e--] = nums1[p1--];
        }

        while (p2 >= 0) {
            nums1[e--] = nums2[p2--];
        }

    }
}
