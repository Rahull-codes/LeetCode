class Solution {
public:
    string largestGoodInteger(string num) {
        int max = -1;
        for(int i = 0 ; i < num.size() - 2 ; i++){
            if(num[i] == num[i+1] && num[i+1] == num[i+2]){
                int num1 = stoi(num.substr(i , 3));
                if(max < num1){
                    max = num1;
                }
            }
        }
        if(max == 0) return "000";
        return max == -1 ? "" : to_string(max);
    }
};