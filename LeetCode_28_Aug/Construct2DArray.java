package com.java.s28thdsa;
// completed
public class Construct2DArray {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int totalElements = original.length;
        if (m * n != totalElements) {
            return new int[0][0]; // Return empty 2D array if not possible
        }

        int[][] result = new int[m][n];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[index];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;
        int[][] result = construct2DArray(original, m, n);

        if (result.length == 0) {
            System.out.println("Empty 2D array");
        } else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

