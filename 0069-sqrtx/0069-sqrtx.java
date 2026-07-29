class Solution {
    public int mySqrt(int x) {
        // Base cases for 0 and 1
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 1;
        int end = x;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is less than or equal to x / mid
            if (mid <= x / mid) {
                ans = mid;     // Save mid as a potential answer
                start = mid + 1; // Try to find a larger value
            } else {
                end = mid - 1;   // Try to find a smaller value
            }
        }

        return ans;
    }
}
