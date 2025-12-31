package algorithmlearning;

import java.util.Stack;

public class BalancedParenthesis {
    public static boolean balanceParanthesis(String s){
        Stack<Character> st = new Stack<>();

        for(char ch :s.toCharArray()){
            if(ch == '(' || ch== '{' || ch=='['){
                st.push(ch);
                System.out.println(st);
            }

            else{
                if(st.isEmpty())
                    return false;
                char top = st.pop();
                if((ch == ')' && top!= '(') || (ch == '}' && top!='{') || (ch == ']' && top != '[' )){
                    return false;
                }
                System.out.println(st);
            }
        } return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "{[())]]}";
        System.out.println(balanceParanthesis(s));
    }
}
