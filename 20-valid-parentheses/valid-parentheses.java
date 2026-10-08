class Solution {
    public boolean isValid(String s) {
        
        String opening = "({[";
        String closing = ")}]";

        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){

            if(opening.indexOf(s.charAt(i)) != -1 ){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty())
                    return false;

                int openingIdx = opening.indexOf(stack.pop());
                int closingIdx = closing.indexOf(s.charAt(i));

                if(openingIdx != closingIdx){
                    return false;
                }
            }
        }
        if(!stack.isEmpty())
            return false;
        
        return true;
    }
}