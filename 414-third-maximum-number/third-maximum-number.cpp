class Solution {
public:
    int thirdMax(vector<int>& nums) {
        int n = nums.size();

        set<int> mySet;

        for (int i = 0; i < n; i++) {
            mySet.insert(nums[i]);
        }

        auto it = mySet.rbegin();

        if (mySet.size() < 3) {
            return *it;
        }

        it++;
        it++;

        return *it;
    }
};