import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String k = t.next();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<k.length();i++){
            if(k.charAt(i) == '{' || k.charAt(i) == '[' || k.charAt(i) == '('){
                st.push(k.charAt(i));
            }
            else if(!st.empty() && ((k.charAt(i) == '}' && st.peek() == '{') || (k.charAt(i) == ']' && st.peek() == '[') || (k.charAt(i) == ')' && st.peek() == '(') )){
                st.pop();
            }
        }
        if(st.empty()){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not balanced");
        }
    }
}
