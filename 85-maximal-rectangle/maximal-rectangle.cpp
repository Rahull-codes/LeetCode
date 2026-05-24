class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        int n = heights.size();
        int area = 0, element = 0, nsl, nsr;

        stack<int> st;

        for (int i = 0; i < n; i++) {
            while (!st.empty() && heights[st.top()] > heights[i]) {
                element = st.top();
                st.pop();

                nsr = i;
                nsl = st.empty() ? -1 : st.top();
                area = max(area, heights[element] * (nsr - nsl - 1));
            }

            st.push(i);
        }

        while (!st.empty()) {
            nsr = n;
            element = st.top();
            st.pop();

            nsl = st.empty() ? -1 : st.top();
            area = max(area, heights[element] * (nsr - nsl - 1));
        }

        return area;
    }

    int maximalRectangle(vector<vector<char>>& matrix) {
        if (matrix.empty())
            return 0;
        
        int n = matrix.size(); //row
        int m = matrix[0].size(); //col
        
        vector<int> heights(m , 0 );
        int maxarea = 0;

        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix[i][j] == '1') heights[j]++;
                else heights[j] = 0 ;
            }

            int area = largestRectangleArea(heights);
            maxarea = max(maxarea, area);
        }

        return maxarea;
    }
};