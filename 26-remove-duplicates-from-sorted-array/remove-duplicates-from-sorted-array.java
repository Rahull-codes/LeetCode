class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0 , j = 1, k = 1 ; 

        while(j < nums.length ){
            if(nums[i] != nums[j]){
                k++; i++;
                nums[i] = nums[j];
            }else{
                j++;
            }
        }

        return k ; 
    }
}