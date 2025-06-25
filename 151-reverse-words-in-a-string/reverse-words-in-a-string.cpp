class Solution {
public:
    string reverseWords(string s) {
        stringstream ss(s);
        vector<string> words;

        while (ss >> s) {
            words.push_back(s);
        }

        string res;
        for (int i = words.size() - 1; i >= 0; i--) {
            res += words[i];
            if (i != 0) {
                res += " ";
            }
        }

        return res;
    }
};