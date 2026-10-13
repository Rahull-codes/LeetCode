// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {

//         Hashmap<Integer , Integer> hashmap = new HashMap<>();

//         PriorityQueue<Integer> heap = new PriorityQueue<>((x,y) -> y - x);

//         for(int i : nums){
//             hashmap.put(i , hashmap.getOrDefault(i  , 0) +1 );
//         }        

//         heap.
        
//     } 
// }

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> hashmap = new HashMap<>();

        PriorityQueue<Integer> heap =
            new PriorityQueue<>((x, y) ->
                hashmap.get(y) - hashmap.get(x));

        for (int i : nums) {
            hashmap.put(i, hashmap.getOrDefault(i, 0) + 1);
        }

        for (int num : hashmap.keySet()) {
            heap.offer(num);
        }

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = heap.poll();
        }

        return res;
    }
}