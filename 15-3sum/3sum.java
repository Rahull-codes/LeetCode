class Solution {

    public void twoSum( int[] nums , int left , List<List<Integer>> res , int target){
        int j = nums.length -1 , i = left ;

        while(i < j){
            if(nums[i] + nums[j] > target){
                j--;
            }else if(nums[i] + nums[j] < target){
                i++;
            }else{
                res.add(Arrays.asList(-target , nums[i] , nums[j]));
                while(i < j && nums[i] == nums[i+1]){
                    i++;
                } 

                while(i < j && nums[j] == nums[j-1]){
                    j--;
                }

                i++;j--;
            }
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if(n < 3){
            return new ArrayList();
        }

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0 ; i < n -2 ; i++){

            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }

            twoSum(nums , i+1 , res , -nums[i]);
        }
        return res;
    }
}