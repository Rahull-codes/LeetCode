class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {

        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {

                if (nums1[i] == nums2[j]) {
                    int great = -1;
                    for (int k = j + 1; k < nums2.size(); k++) {
                        if (nums2[k] > nums2[j]) {
                            great = nums2[k];
                            break;
                        }
                    }

                    nums1[i] = great;
                    break;
                }
            }
        }
        return nums1;
    }
};