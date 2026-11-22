class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer , Integer> mp = new HashMap<>();

        mp.put(0 , -1);
        int currsum = 0 ; 
        int maxL = 0;

        for(int i = 0 ; i < nums.length ; i++){
            currsum +=  (nums[i] == 0) ? -1 : 1;

            if(mp.containsKey(currsum)){
                maxL = Math.max(maxL , i - mp.get(currsum));
            }else{
                mp.put(currsum , i);
            }
        }
        
        return maxL;
    }
}