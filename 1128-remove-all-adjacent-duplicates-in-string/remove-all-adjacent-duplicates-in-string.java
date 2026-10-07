class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        String res="" ;
        for (int i = 0; i < s.length(); i++) {
           
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        while(!stack.isEmpty()){
            res += stack.pop();
        }
        return  new StringBuilder(res).reverse().toString();
    }
}