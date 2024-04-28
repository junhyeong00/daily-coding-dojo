import java.util.Stack;

public class Rotation {
    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i += 1) {
            String str = s.substring(i, s.length()) + s.substring(0, i);

            answer += validate(str) ? 1 : 0;
        }

        return answer;
    }

    public boolean validate(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i += 1) {
            char c = str.charAt(i);

            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            if (c == ')' && stack.peek() == '(') {
                stack.pop();
                continue;
            }

            if (c == '}' && stack.peek() == '{') {
                stack.pop();
                continue;
            }

            if (c == ']' && stack.peek() == '[') {
                stack.pop();
                continue;
            }

            stack.push(c);
        }

        return stack.empty();
    }
}
