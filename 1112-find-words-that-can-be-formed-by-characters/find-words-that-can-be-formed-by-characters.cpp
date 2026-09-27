class Solution {
public:
    int countCharacters(vector<string>& words, string chars) {
        vector<int> vec1(26, 0);
        vector<int> vec2(26, 0);
        int count = 0;
        for (char  &c : chars) {
            vec1[c - 'a']++;
        }
        int letter = 0;
        for (string s : words) {
            vec2 = vec1;
            bool possible = true;

            for (int i = 0; i < s.size(); i++) {
                int index = s[i] - 'a';

                if (vec2[index] > 0) {
                    vec2[index]--;
                } else {
                    possible = false;
                    break;
                }
            }

            if(possible == true){
                letter += s.size();
            }
        }

        return letter;
    }
};