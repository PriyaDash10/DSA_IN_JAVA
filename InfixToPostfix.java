import java.util.Stack;

 class InfixToPostfix {
    static int priority(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        return 0;
    }

    public static void main(String[] args) {
        String infix = "a+b*c";
        String postfix = "";
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            
            if (Character.isLetterOrDigit(ch)) {
                postfix += ch;
            }
          
            else if (ch == '(') {
                s.push(ch);
            }
            
            else if (ch == ')') {
                while (s.peek() != '(')
                    postfix += s.pop();
                s.pop(); 
            }
       
            else {
                while (!s.isEmpty() && priority(s.peek()) >= priority(ch)) {
                    postfix += s.pop();
                }
                s.push(ch);
            }
        }

        while (!s.isEmpty()) {
            postfix += s.pop();
        }

        System.out.println("Postfix: " + postfix);
    }
}
