import java.util.Scanner;
import java.util.Stack;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        System.out.print(rev(n));

    }
    public static String rev(String n){
        char[] ch=n.toCharArray();

        Stack<Character> st= new Stack<>();
        for(int i=0;i<ch.length;i++){
            st.push(ch[i]);
        }
        for(int i=0;i<ch.length;i++)
        {ch[i]=st.pop();
        }
        return new String(ch);
    }
}
