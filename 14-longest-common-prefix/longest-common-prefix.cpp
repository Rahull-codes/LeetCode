class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string pref = strs[0];
        int prefLen = strs[0].length();

        for(int i =1 ; i<strs.size() ; i++){
            string s = strs[i];
            while(prefLen > s.length() || pref != s.substr(0 , prefLen)){
                prefLen--;
                if(prefLen == 0){
                    return "";
                }
                pref = pref.substr(0,prefLen);
            }
        }
        return pref;
    }
};