class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer , Integer> mp = new HashMap<>();

        int count = 0 , cumsum = 0, rem;
        mp.put(0 , 1);
        for(int i = 0 ; i < nums.length ; i++){
            cumsum += nums[i] ;
            rem = cumsum % k ;
            if(rem < 0) 
                rem = k + rem ;
            if(mp.containsKey(rem)){
                count += mp.get(rem);
                mp.put(rem , mp.get(rem) + 1 );
            }else{
                mp.put(rem , 1);
            }
        }
        return count;
    }
}