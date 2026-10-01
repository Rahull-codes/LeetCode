class Solution {
public:
    int numberOfMatches(int n) {
       int temp = n , matches= 0;
        while(temp>1){
            if(temp %2 == 0){
                matches += (temp/2);
                temp = temp /2;
            }
            else {
                matches += ((temp -1) / 2) + 1;
                temp =  (temp -1) / 2;
            }
        }
        return matches;
    }
};