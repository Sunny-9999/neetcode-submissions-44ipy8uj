class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{' || c=='['){
                stack.push(c);
            }else{
               
               // System.out.println(c+" "+stack.peek());
                if((stack.isEmpty())||(c==')' && stack.peek()!='(') || (c=='}' && stack.peek()!='{') || (c==']' && stack.peek()!='['))
                return false;
                else stack.pop();
            }
        }

        return stack.isEmpty();
    }
}