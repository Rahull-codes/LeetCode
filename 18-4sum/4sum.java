class Solution {

    public void twoSum(int[] nums , List<List<Integer>> res , int left , long target , int second , int first){
        int i = left , j = nums.length - 1;

        while(i < j){
            long sum = (long) nums[j] + nums[i] ;
            if(sum < target){
                i++;
            }else if(sum > target){
                j--;
            }else{
                res.add(Arrays.asList(first , second ,nums[i] , nums[j]  ));
                while(i < j && nums[i] == nums[i+1]) i++;
                while(i < j && nums[j] == nums[j-1]) j--;

                i++;j--;
            }
        }
    }

    public void threeSum(int[] nums , List<List<Integer>> res , int left , long target , int first){

        int n = nums.length;
        if(n < 3)
            return ;

        for(int i = left ; i < n- 2 ; i++){

            if(i > left && nums[i-1] == nums[i] ){
                continue;
            }

            twoSum(nums , res , i+1 , target-nums[i] ,  nums[i] , first);
        }
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
         
        int n = nums.length ;
        List<List<Integer>> res = new ArrayList<>();
         Arrays.sort(nums);
         
        if(n < 4){
            return res;
        }

        for(int i = 0 ; i < n -3  ; i++){

            if(i != 0 && nums[i-1] == nums[i] ){
                continue;
            }

            threeSum(nums , res , i+1 ,(long) target - nums[i] , nums[i]);
        }

        return res;
    }
}