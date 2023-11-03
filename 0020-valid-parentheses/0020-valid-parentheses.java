class Solution {
    public boolean isValid(String s) {
        String[] strArray = null;
        strArray = s.split(" ");
        Stack<Character> stack = new Stack<>();
        for (char x: s.toCharArray()){
            if(x=='('){
                stack.push(')');
            }else if (x=='{') {
                stack.push('}');
            }else if (x=='['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.pop()!= x){
                return false;
            }
        }
        return stack.isEmpty();
    }
}