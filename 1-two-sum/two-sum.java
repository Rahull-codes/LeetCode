class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            
            Integer diff = target - nums[i];
            Integer idx = map.get(diff);
            if (idx != null && idx != i) {
                if (idx > i) {
                    res[0] = i;
                    res[1] = idx;
                } else {
                    res[0] = idx;
                    res[1] = i;
                }
            }
            map.put(nums[i], i);
        }
        return res;
    }
}