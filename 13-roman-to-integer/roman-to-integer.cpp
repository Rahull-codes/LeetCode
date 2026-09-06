class Solution {
public:

    int value(char s){
        if(s == 'X'){
            return 10;
        }else if(s == 'I'){
            return 1;
        }else if(s == 'V'){
            return 5;
        }else if(s == 'L'){
            return 50;
        }else if(s == 'C'){
            return 100;
        }else if(s == 'D'){
            return 500;
        }else if(s == 'M'){
            return 1000;
        }
        return 0;
    }

    int romanToInt(string s) {
        int sum = 0 ; 

        for(int i = 0 ; i  < s.length() ; i++){
            if(value(s[i])  < value(s[i+1]) ){
                sum += value(s[i+1]) - value(s[i]);
                i++;
            }else{
                sum += value(s[i]);
            }    
        }
        return sum ;
    }
};