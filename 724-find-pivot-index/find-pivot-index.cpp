class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int sumleft[nums.size()];
       
        int sum = 0 , i = 0 ,cumlsum =0 ;
        for(i  ; i < nums.size() ; i++){
            sum += nums[i];
            sumleft[i] = sum;
        }
        
        for(i = 0 ; i < nums.size() ;i++){
           
            if( cumlsum == (sum- cumlsum - nums[i]) ){
                return i;
            }
             cumlsum += nums[i];
        }

        return -1;
    }
};