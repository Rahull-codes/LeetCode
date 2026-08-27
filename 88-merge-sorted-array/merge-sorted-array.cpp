class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int left = 0 , right  = 0;
        vector<int> arr;
            while(left<m && right<n){
            // if(left >= m || right >= )
            if(nums1[left] < nums2[right] ){
                arr.push_back(nums1[left]);
                left++;
            }else{
                arr.push_back(nums2[right]);
                right++;
            }
        }

        while(left < m){
            arr.push_back(nums1[left]);
            left++;
        }
        while(right < n){
             arr.push_back(nums2[right]);
                right++;
        }
        nums1 = arr;
    }
};