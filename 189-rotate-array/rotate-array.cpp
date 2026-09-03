class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int size = nums.size();
        vector<int> arr(size) ;
        // int j = 0;
        // for(int i = 0 ; i < size ; i++){

        //     if(i+k < size){
        //     arr[i] = nums[i+k];
        //     }else{
        //         j = (i+k) % size;
        //         arr[i] = nums[j];
        //     }
        // }
        // nums = arr;

        k = k % size;

        for(int i = 0; i < size; i++) {
            int j = (i - k + size) % size;
            arr[i] = nums[j];
        }

        nums = arr;
    }
};