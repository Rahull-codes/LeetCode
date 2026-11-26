class Solution {
    public int longestConsecutive(int[] nums) {
        
        int longest = 1;

        if(nums.length == 0)
            return 0;

        HashSet<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }

        for(Integer e : set){

            if(!set.contains(e-1)){
                int cnt = 1;
                int x = e;

                while(set.contains(x+1)){
                    cnt++;
                    x = x+1;
                }

                longest = Math.max(longest , cnt);
            }

        }

        return longest;
    }
}