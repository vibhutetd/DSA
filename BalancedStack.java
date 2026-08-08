import java.util.*;

class BalancedStack {
    static Boolean isBalanced(String str) {
        java.util.Stack<Character> st = new java.util.Stack<>();
        int n = str.length();
        
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            
      
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
                       else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.size() == 0) return false;
                
                char top = st.peek();
               
                if ((ch == ')' && top == '(') || 
                    (ch == '}' && top == '{') || 
                    (ch == ']' && top == '[')) {
                    st.pop();
                } else {
                    return false; 
                }
            }
        }
        
        if (st.size() > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
