class Solution {
public:

    int strStr(string haystack, string needle) {

        int n = haystack.size();
        int m = needle.size();

        if (m > n)
            return -1;

        for (int i = 0; i <= n - m; i++) {

            if (haystack[i] == needle[0]) {
                bool flag = true;
                for (int j = i; j < i + m; j++) {
                    if (haystack[j] != needle[j - i]) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    return i;
            }
        }
        return -1;
    }
};