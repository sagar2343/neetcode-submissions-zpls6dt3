class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {
            
            if (s.equals("+")) {
                int d2 = stack.pop();
                int d1 = stack.pop();
                stack.push(d1 + d2);
            } else if (s.equals("-")) {
                int d2 = stack.pop();
                int d1 = stack.pop();
                stack.push(d1 - d2);
            } else if (s.equals("*")) {
                int d2 = stack.pop();
                int d1 = stack.pop();
                stack.push(d1 * d2);
            } else if (s.equals("/")) {
                int d2 = stack.pop();
                int d1 = stack.pop();
                stack.push(d1 / d2);
            } else {
                // it is a number 
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.peek();
    }
}
