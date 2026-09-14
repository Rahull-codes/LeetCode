class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int len = INT_MAX, sum = 0, l = 0;
        for (int r = 0; r < nums.size(); r++) {

            sum += nums[r];

            while (sum >= target) {

            len = min(len , r-l+1);

            sum = sum - nums[l];

            l++;
            }
        }

        return len == INT_MAX ? 0 : len;
    }
};