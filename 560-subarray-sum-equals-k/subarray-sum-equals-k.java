class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cumSum = 0 , result = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(cumSum , 1);

        for(int i = 0 ; i < n ; i++){
            cumSum += nums[i];

            if(map.containsKey(cumSum-k)){
                result += map.get(cumSum - k);
            }

            map.put(cumSum , map.getOrDefault(cumSum , 0) + 1);
        }

        return result;
    }
}