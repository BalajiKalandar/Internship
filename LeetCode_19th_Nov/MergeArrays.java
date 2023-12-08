package com.java.dec19Nov;

import java.util.ArrayList;
import java.util.List;

public class MergeArrays {
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> result = new ArrayList<>();

        int i = 0, j = 0;
        while (i < nums1.length || j < nums2.length) {
            int id1 = i < nums1.length ? nums1[i][0] : Integer.MAX_VALUE;
            int id2 = j < nums2.length ? nums2[j][0] : Integer.MAX_VALUE;

            if (id1 == id2) {
                int sum = nums1[i][1] + nums2[j][1];
                result.add(new int[]{id1, sum});
                i++;
                j++;
            } else if (id1 < id2) {
                result.add(new int[]{id1, nums1[i][1]});
                i++;
            } else {
                result.add(new int[]{id2, nums2[j][1]});
                j++;
            }
        }

        return result.toArray(new int[0][0]);
    }

    public static void main(String[] args) {
        int[][] nums1 = {{1, 2}, {2, 3}, {4, 5}};
        int[][] nums2 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] result1 = mergeArrays(nums1, nums2);
        printResult(result1);

        int[][] nums3 = {{2, 4}, {3, 6}, {5, 5}};
        int[][] nums4 = {{1, 3}, {4, 3}};
        int[][] result2 = mergeArrays(nums3, nums4);
        printResult(result2);
    }

    private static void printResult(int[][] result) {
        for (int[] pair : result) {
            System.out.println("[" + pair[0] + "," + pair[1] + "]");
        }
        System.out.println();
    }
}
