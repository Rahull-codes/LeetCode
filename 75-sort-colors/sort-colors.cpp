class Solution {
public:
    void sortColors(vector<int>& nums) {
        // for(int i = 0 ; i<nums.size() ; i++){
        //     for(int j = 0 ; j<nums.size() ; j++){
        //         if(nums[i] < nums[j]){
        //             swap(nums[i] , nums[j]);
        //         }
        //     }
        // }

        int low=0 , mid = 0 , high =nums.size() -1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums[mid], nums[low]);
                mid++;
                low++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums[mid] , nums[high]);
                high--;
            }
        }
    }
};