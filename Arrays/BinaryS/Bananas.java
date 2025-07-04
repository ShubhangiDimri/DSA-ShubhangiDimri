class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int slow = 1;
        int fast = findMaxPile(piles);

        while (slow < fast) {
            int speed = slow + (fast - slow) / 2;
            int timeRequired = calculateHours(piles, speed);

            if (timeRequired <= h) {
                fast = speed;
            } else {
                slow = speed + 1;
            }
        }

        return slow;
    }

    // Finds the largest pile — the fastest possible speed
    private int findMaxPile(int[] piles) {
        int max = 0;
        for (int bananas : piles) {
            if (bananas > max) {
                max = bananas;
            }
        }
        return max;
    }

    // Calculates total time needed to eat all piles at a given speed
    private int calculateHours(int[] piles, int speed) {
        int hours = 0;
        for (int bananas : piles) {
            hours += (bananas + speed - 1) / speed; // ceil division
        }
        return hours;
    }
}
