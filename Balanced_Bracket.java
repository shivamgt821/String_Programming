import java.util.Stack;
public class Balanced_Bracket {
	
	    public static void main(String args[]) {
	        System.out.println(isbalanced("[{(a,b)}]"));
	        System.out.println(isbalanced("[{(a},b)]"));
	        System.out.println(isbalanced("{)(a,b}"));
	    }
	    	static boolean isbalanced(String s) {
	        Stack<Character> stack  = new Stack<Character>();
	        for(int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if(c == '[' || c == '(' || c == '{' ) {     
	                stack.push(c);
	            } else if(c == ']') {
	                if(stack.isEmpty() || stack.pop() != '[') {
	                    return false;
	                }
	            } else if(c == ')') {
	                if(stack.isEmpty() || stack.pop() != '(') {
	                    return false;
	                }           
	            } else if(c == '}') {
	                if(stack.isEmpty() || stack.pop() != '{') {
	                    return false;
	                }
	            }
	        }
	        return stack.isEmpty();
	    }
	}

