class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int j = 0, sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            sum = 0 ;
            j = i ;
            while (j < n) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
                
                j++;
            }
        }
        return count;
    }
}