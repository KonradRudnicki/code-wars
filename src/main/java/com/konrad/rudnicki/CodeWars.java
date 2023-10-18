package com.konrad.rudnicki;

public class CodeWars {

    public static int material(int[] spaceship) {
        if (spaceship == null || spaceship.length <= 2) {
            return 0;
        }

        int arraySize = spaceship.length;

        int leftPointerIndex = 0, rightPointerIndex = arraySize;
        int maxLeftValue = spaceship[0], maxRightValue = spaceship[arraySize - 1];
        int result = 0, currentValue;

        for (int i = 0; i < arraySize; i++) {
            if (maxLeftValue <= maxRightValue) {
                currentValue = spaceship[leftPointerIndex + 1];
                leftPointerIndex++;

                result += Math.max(maxLeftValue - currentValue, 0);

                if (currentValue >= maxLeftValue) {
                    maxLeftValue = currentValue;
                }

            } else {
                currentValue = spaceship[rightPointerIndex - 1];
                rightPointerIndex--;

                result += Math.max(maxRightValue - currentValue, 0);

                if (currentValue >= maxRightValue) {
                    maxRightValue = currentValue;
                }
            }
        }

        return result;
    }
}
