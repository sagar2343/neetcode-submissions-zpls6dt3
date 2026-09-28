class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxSpeed = 0;
        int minSpeed = 1;

        for (int n : piles) {
            maxSpeed = Math.max(maxSpeed, n);
        }

        while (minSpeed < maxSpeed) {
            int mid = minSpeed + (maxSpeed - minSpeed) / 2;

            if (canEatInTime(piles, h, mid)) {
                maxSpeed = mid;
            } else {
                minSpeed = mid + 1;
            }
        }

        return minSpeed;
    }

    boolean canEatInTime(int[] piles, int h, int mid) {
        int hours = 0;

        for (int n : piles) {
            hours += Math.ceil((double)n / mid);
        }

        return hours <= h;
    }
}
