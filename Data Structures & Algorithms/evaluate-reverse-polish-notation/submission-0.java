class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String operators = "+-*/";

        for (String s : tokens) {
            if (operators.indexOf(s) != -1) {
                int d2 = stack.pop();
                int d1 = stack.pop();
                int d3 = 0;
                if (s.equals("+") == true)
                    d3 = d1 + d2;
                if (s.equals("-") == true) 
                    d3 = d1 - d2;
                if (s.equals("*") == true)
                    d3 = d1 * d2;
                if (s.equals("/") == true) 
                    d3 = d1 / d2;
                stack.push(d3);
            } else {
                stack.push(Integer.parseInt(s));
            }

        }
        return stack.peek();
    }
}
