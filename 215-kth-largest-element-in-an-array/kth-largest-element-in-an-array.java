class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        int res= 0 ;
        for(int n : nums){
            heap.add(n);
        }

        for(int i = 0 ; i < k ; i++ ){
            res = heap.poll();
        }

        return res;

    }
}