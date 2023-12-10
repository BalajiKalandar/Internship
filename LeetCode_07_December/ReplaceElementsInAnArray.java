package com.java.timest;
import java.util.HashMap;

public class ReplaceElementsInAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[][] operations = {{1, 3}, {4, 7}, {6, 1}};
        int[] result = arrayChange(nums, operations);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }
        for (int[] i : operations) {
            if (hm.containsKey(i[0])) {
                int idx = hm.remove(i[0]);
                hm.put(i[1], idx);
            }
        }

        for (int i : hm.keySet()) {
            nums[hm.get(i)] = i;
        }
        return nums;
    }
}
