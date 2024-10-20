import java.util.*;

public class isValidPrenthesis {
    public static boolean isPar(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (c == '(')
                stack.push(')');

            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }

           
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your String");
        String input = s.nextLine();

        System.out.println(isPar(input));

    }
}