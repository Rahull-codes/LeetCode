class Solution {
    public int calculate(int op1 , int op2 , String Oper){
        switch(Oper){
            case "+" : return op1 + op2;
            case "-" : return op1 - op2;
            case "/" : return op1 / op2;
            case "*" : return op1 * op2;           
       }
       return 0;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int op1 , op2;
        String operator = "+*/-" ;

        for(int i = 0 ; i < tokens.length ; i++ ){
            String element = tokens[i];

            if(operator.indexOf(element) == -1){
                stack.push(Integer.parseInt(element));
            }else{
                op2 = stack.pop();
                op1 = stack.pop();

            int res = calculate(op1 , op2 , element);

            stack.push(res);
            
            }
        }
        return stack.peek();
    }
}