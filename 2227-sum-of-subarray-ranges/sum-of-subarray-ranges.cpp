class Solution {
private:
    long long sumSubarrayMins(vector<int>& arr) {
        int n = arr.size();
        vector<int> NSL(n);
        vector<int> NSR(n);
        stack<int> st;

        // 1. Calculate NSL (Next Smaller to Left)
        for (int i = 0; i < n; i++) {
            while (!st.empty() && arr[st.top()] >= arr[i]) {
                st.pop();
            }
            NSL[i] = st.empty() ? -1 : st.top();
            st.push(i);
        }

        // Clear the stack to reuse it for NSR
        while (!st.empty()) {
            st.pop();
        }

        // 2. Calculate NSR (Next Smaller to Right)
        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && arr[st.top()] > arr[i]) {
                st.pop();
            }
            NSR[i] = st.empty() ? n : st.top();
            st.push(i);
        }

        // 3. Calculate final sum (NO MODULO NEEDED FOR THIS PROBLEM)
        long long sum = 0;
        for (int i = 0; i < n; i++) {
            long long ls = i - NSL[i];
            long long rs = NSR[i] - i;
            long long totalways = ls * rs;
            sum += totalways * arr[i];
        }

        return sum;
    }

    long long sumSubarrayMaxs(vector<int>& arr) {
        int n = arr.size();
        vector<int> NGL(n); // Next Greater to Left
        vector<int> NGR(n); // Next Greater to Right
        stack<int> st;

        // 1. Calculate NGL (Next Greater to Left)
        for (int i = 0; i < n; i++) {
            while (!st.empty() && arr[st.top()] <= arr[i]) {
                st.pop();
            }
            NGL[i] = st.empty() ? -1 : st.top();
            st.push(i);
        }

        // Clear the stack to reuse it for NGR
        while (!st.empty()) {
            st.pop();
        }

        // 2. Calculate NGR (Next Greater to Right)
        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && arr[st.top()] < arr[i]) {
                st.pop();
            }
            NGR[i] = st.empty() ? n : st.top();
            st.push(i);
        }

        // 3. Calculate final sum (NO MODULO NEEDED FOR THIS PROBLEM)
        long long sum = 0;
        for (int i = 0; i < n; i++) {
            long long ls = i - NGL[i];
            long long rs = NGR[i] - i;
            long long totalways = ls * rs;
            sum += totalways * arr[i];
        }

        return sum;
    }

public:
    long long subArrayRanges(vector<int>& nums) {
        // Range = Max - Min, so Total Range Sum = Total Max Sum - Total Min Sum
        return sumSubarrayMaxs(nums) - sumSubarrayMins(nums);
    }
};