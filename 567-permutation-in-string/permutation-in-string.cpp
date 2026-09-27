class Solution {
public:
    bool checkInclusion(string s1, string s2) {

        int i = 0, j = 0;
        int n = s1.length(), m = s2.length();

        vector<int> s1_freq(26, 0);
        vector<int> s2_freq(26, 0);

        if(n > m ){
            return false;
        }

        for (char &ch : s1) {
            s1_freq[ch - 'a']++;
        }

        while (j < m) {

            s2_freq[s2[j] - 'a']++;

            if (j - i + 1 > n) {
                s2_freq[s2[i] - 'a']--;
                i++;
            }
            
            if (s1_freq == s2_freq) {
                return true;
            }

            j++;
        }
        return false;
    }
};