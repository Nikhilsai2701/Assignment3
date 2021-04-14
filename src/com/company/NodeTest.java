package Assignment;
import java.util.*;
class reverse {
    public static String ReverseString(String str) {

        char[] reverseString = new char[str.length()];

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {

            stack.push(str.charAt(i));
        }
        int i = 0;

        while (!stack.isEmpty()) {

            reverseString[i++] = stack.pop();

        }
        return new String(reverseString);
    }
    public static void main(String[] args) {

        String str = "anupama";
        System.out.println(str + " <- Reverse -> "

                + ReverseString(str));
    }
}