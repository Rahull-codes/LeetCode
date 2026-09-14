class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char, int> mp;
        int n = s.size(), l = 0, len = 0;

        for ( int r = 0; r < n; r++) {
            if (mp.find(s[r]) != mp.end()) {

                if (mp[s[r]] < l) {
                    mp[s[r]] = r;
                } else {
                    l = mp[s[r]] + 1;
                }
            }

            mp[s[r]] = r;

            len = max(len, r - l + 1);
        }

        return len;
    }
};