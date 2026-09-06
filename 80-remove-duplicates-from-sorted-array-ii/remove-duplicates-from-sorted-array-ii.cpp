class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int k = 0;
        int size = nums.size();
        for (int i = 0; i < size; i++) {
            if (k < 2 || nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
};