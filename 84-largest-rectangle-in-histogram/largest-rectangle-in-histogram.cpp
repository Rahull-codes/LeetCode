class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        int n = heights.size();
        int area = 0, curarea = 0;

        vector<int> NSL(n);
        vector<int> NSR(n);
        stack<int> st;

        for(int i = 0 ; i < n ; i++){
            while(!st.empty() && heights[st.top()] >= heights[i] ){
                st.pop();
            }

            NSL[i] = st.empty() ? -1 : st.top();
            st.push(i);
        }

        while(!st.empty()){
            st.pop();
        }

        for(int i = n-1 ; i >= 0 ; i--){
            while(!st.empty() && heights[st.top()] > heights[i] ){
                st.pop();
            }

            NSR[i] = st.empty() ? n : st.top();
            st.push(i);
        }        

        for(int i = 0 ; i < n ; i++){
            curarea = heights[i] * (NSR[i] - NSL[i] - 1);
            area = max(area,curarea);
        }
        
        return area;
    }
};