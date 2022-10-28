package CompetetiveCoding;
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(isValid("{{}}"));
    }
    public static boolean isValid(String s){
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (char w: s.toCharArray()){

            if (w=='(' || w=='{' || w=='[') {
                stack.push(w);
            } else if (w == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }else if (w == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }else if (w == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }



}
