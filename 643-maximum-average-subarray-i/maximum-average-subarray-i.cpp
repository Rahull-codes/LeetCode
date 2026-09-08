class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        int n = nums.size();
        int l = 0;

        double sum = 0;
        double maxSum = -DBL_MAX;

        for (int r = 0; r < n; r++) {

            sum += nums[r];

            // Once window size becomes k
            if (r >= k - 1) {

                maxSum = max(maxSum, sum);

                // Remove left element
                sum -= nums[l];
                l++;
            }
        }

        return maxSum / k;
    }
};