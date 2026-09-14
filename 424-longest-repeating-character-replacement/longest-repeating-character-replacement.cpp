class Solution {
public:
    int characterReplacement(string s, int k) {
        unordered_map<char , int > freq;
        int i = 0 , res = 0 , maxfreq = 0;

        for(int j = 0 ; j < s.size() ; j++){

            freq[s[j]]++;

            maxfreq = max(maxfreq , freq[s[j]]) ;

            if( ( (j-i+1) - maxfreq ) <= k  ){
                res = max(res , j-i+1);
            }else{
                freq[s[i]]--;
                i++;
            }
        }
        return res;
    
    }
};