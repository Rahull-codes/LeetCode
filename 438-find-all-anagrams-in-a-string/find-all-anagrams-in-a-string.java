class Solution {
    public boolean allZeros(int[] count){
        for(int num : count){
            if(num != 0){
                return false;
            }
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {

        int[] count = new int[26];
        Arrays.fill(count, 0);

        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        int i = 0, j = 0;
        int n = s.length(), k = p.length();
        List<Integer> res = new ArrayList<>();

        while (j < n) {
            count[s.charAt(j) - 'a']--;

            if (j - i + 1 == k) {
                if (allZeros(count)) {
                    res.add(i);
                }

                count[s.charAt(i) - 'a']++;
                i++;
            }
            j++;
        }

        return res;
    }
}