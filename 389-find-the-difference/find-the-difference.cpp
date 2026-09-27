class Solution {
public:
    char findTheDifference(string s, string t) {
        int n = s.size() , m = t.size();
        sort(begin(s) , end(s));
        sort(begin(t) , end(t));

        for(int i = 0 ; i < m ;i++){
            if(n == 0 ) return t[i];

            if(s[i] != t[i]){
                return t[i]; 
            }
        } 
        return ' ';
    }
};