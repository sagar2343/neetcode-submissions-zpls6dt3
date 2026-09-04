class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        

        for (int i=0; i<temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int day = i - stack.peek();
                result[stack.pop()] = day;
            }
            stack.push(i);
        }

        return result;

























        // ArrayDeque<Integer> stack=new ArrayDeque<>();
        // int[] res = new int[temperatures.length];

        // for (int i=0; i<temperatures.length; i++) {
        //     while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
        //         int index = stack.pop();
        //         res[index] = i - index;
        //     }
        //     stack.push(i);
        // }
        
        // return res;

        

    }
}
