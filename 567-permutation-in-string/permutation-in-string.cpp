class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        int n = s1.length();
        int m = s2.length();

        sort(begin(s1) , end(s1));

        for(int i = 0 ; i <= m-n ; i++){
            string substring = s2.substr(i , n);

            sort(begin(substring) , end(substring));

            if(substring == s1){
                return true;
            }
        }

        return false;
    }
};