class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for (String t : tokens) {
            switch (t) {
                case "+" -> s.push(s.pop() + s.pop());
                case "-" -> s.push(-s.pop() + s.pop());
                case "*" -> s.push(s.pop() * s.pop());
                case "/" -> {
                    int a = s.pop();
                    int b = s.pop();
                    s.push(b / a);
                }
                default -> s.push(Integer.parseInt(t));
            }
        }
        return s.pop();
    }
}