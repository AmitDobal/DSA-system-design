package com.amit.dsa.a1_array_string.b5_majority_element;

import java.util.*;

public class MajorityElement {
    /**
     * Given an array of size n, find the majority element.
     * The majority element is the element that appears more than n/2 times.
     *
     * @param nums the input array
     * @return the majority element
     */
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        Arrays.stream(nums)
                .forEach((num) -> freq.put(num, freq.getOrDefault(num, 0) + 1));
        List<Integer> res = new ArrayList<>();
        res.add(-1);
        freq.forEach((key, val) -> {
            if (val > nums.length / 2) {
                res.add(key);
            }
        });

        return res.get(res.size() - 1);
    }
}
