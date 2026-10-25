class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String , List<String> > map = new HashMap<>();
        
        for(String ele : strs){
            char[] arr = ele.toCharArray();
            Arrays.sort(arr);

            String sorted = new String(arr) ;

            if(!map.containsKey(sorted)){
                map.put(sorted , new ArrayList<>());
            }

            map.get(sorted).add(ele);
        }

        return new ArrayList<>(map.values());
    }
}