package com.java.dec22;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println(canPlaceFlowers(flowerbed1, n1));  // Output: true

        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println(canPlaceFlowers(flowerbed2, n2));  // Output: false
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0) {
                // Check if the current position and its adjacent positions are empty
                boolean prevEmpty = (i == 0) || (i > 0 && flowerbed[i - 1] == 0);
                boolean nextEmpty = (i == length - 1) || (i < length - 1 && flowerbed[i + 1] == 0);

                if (prevEmpty && nextEmpty) {
                    // Plant a flower at the current position
                    flowerbed[i] = 1;
                    count++;

                    // Skip the next position since it cannot have a flower
                    i++;
                }
            }
        }

        return count >= n;
    }
}
