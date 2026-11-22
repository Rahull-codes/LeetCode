class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        HashMap<Integer , Integer> mp = new HashMap<>();

        mp.put(0 , -1);

        int remainder = 0 ;
        long cumsum = 0;

        for(int i =  0 ; i < nums.length ; i++){
            cumsum = cumsum + nums[i];
            remainder = (int)cumsum % k ;
            if(mp.containsKey(remainder)){
                if(i - mp.get(remainder)  > 1){
                    return true;
                }
            }else{
                mp.put(remainder , i);
            }
        }
        return false; 
    }
}