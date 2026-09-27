// class Solution {
// public:
//     bool checkInclusion(string s1, string s2) {
//         unordered_map<char, int> freq;
//         unordered_map<char, int> temp;
//         int i = 0;

//         for (int j = 0; j < s1.size(); j++) {
//             freq[s1[j]]++;
//         }

//         for (int j = 0; j < s2.size(); j++) {
//             temp = freq;

//             for (int i = j; i < j + s1.size(); i++) {
//                 if (temp.count(s2[i])) {
//                     temp[s2[i]]--;
//                 }
//             }
//             for (auto it : temp) {
//                 if (it.second != 0) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// };


class Solution {
public:
    bool checkInclusion(string s1, string s2) {

        unordered_map<char, int> freq;

        for (char ch : s1) {
            freq[ch]++;
        }

        // Every possible window
        for (int j = 0; j + s1.size() <= s2.size(); j++) {

            unordered_map<char, int> temp = freq;

            // Check current window
            for (int i = j; i < j + s1.size(); i++) {

                if (temp.count(s2[i])) {
                    temp[s2[i]]--;
                } 
                else {
                    break;
                }
            }

            // Check whether all frequencies became 0
            bool found = true;

            for (auto it : temp) {
                if (it.second != 0) {
                    found = false;
                    break;
                }
            }

            if (found) {
                return true;
            }
        }

        return false;
    }
};