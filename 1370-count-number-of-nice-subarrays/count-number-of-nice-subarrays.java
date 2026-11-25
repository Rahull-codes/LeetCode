class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer , Integer> mp = new HashMap<>();

        mp.put(0 , 1);

        int oddCount = 0 , res = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
           oddCount += nums[i]%2;

           if(mp.containsKey(oddCount - k)){
            res += mp.get(oddCount - k);
           }

           mp.put(oddCount , mp.getOrDefault(oddCount , 0) + 1);
        }

        return res;
    }
}