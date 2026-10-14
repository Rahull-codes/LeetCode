class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] res = new int[nums1.length];
        int i = 0, j = 0, k = 0;
        
        while (i < m && j < n) {
            if (nums1[i] > nums2[j]) {
                res[k] = nums2[j];
                j++;
                k++;
            } else {
                res[k] = nums1[i];
                i++;
                k++;

            }
        }
        while (i < m) {
            res[k] = nums1[i];
            k++;
            i++;
        }

        while (j < n) {
            res[k] = nums2[j];
            k++;
            j++;
        }
        int l = 0;
        for (int e : res) {
            nums1[l] = e;
            l++;
        }
    }
}