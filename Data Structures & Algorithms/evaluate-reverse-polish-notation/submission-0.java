class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();

        for(String token:tokens){
            if(isInteger(token))
                stack.push(Integer.parseInt(token));
            else{
                int num2= stack.pop(),
                num1=stack.pop();

               int result = switch (token) {
    case "+" -> num1 + num2;
    case "-" -> num1 - num2;
    case "*" -> num1 * num2;
    case "/" -> num1 / num2;
    default  -> throw new IllegalArgumentException("Unknown: " + token);
};
             


                    stack.push(result);
            }    


        }

        return stack.peek();
    }

    public boolean isInteger(String s) {
    try {
        Integer.parseInt(s);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}

}