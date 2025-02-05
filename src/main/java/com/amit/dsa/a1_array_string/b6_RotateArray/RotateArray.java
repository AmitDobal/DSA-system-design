package com.amit.dsa.a1_array_string.b6_RotateArray;

import java.util.*;

public class RotateArray {
    /**
     * Rotates the elements of the given array to the right by k steps.
     *
     * This method creates a new list to temporarily store the rotated elements.
     * It calculates the new index for each element using modular arithmetic and
     * populates the temporary list. Finally, it updates the original array
     * with the elements from the temporary list.
     *
     * @param nums the array to be rotated
     * @param k the number of steps to rotate the array
     */
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        List<Integer> rotatedArray = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int idx = (size -( k % size) + i ) % size;
            rotatedArray.add(nums[idx]);
        }

        for(int i = 0; i < size; i++){
            nums[i] = rotatedArray.get(i);
        }
    }
}
