class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        int temp = n;
        HashSet<Integer> set = new HashSet<>();

        while(sum != 1){

            if(set.contains(sum)){
                return false;
            }
            set.add(sum);
            sum = 0;
            while(n != 0 ){
                sum += (n%10) * (n%10);
                n = n/10;
            }
            n = sum;
            
        }
        return true;
}}