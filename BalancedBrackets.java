import java.util.*;
public class BalancedBrackets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Expression: ");
        
        String expr = sc.nextLine();
        System.out.println(reverseList(expr));
    }


    public static String reverseList(String expr){
        ArrayDeque<Character> stack = new ArrayDeque<>();
        char arr[] = expr.toCharArray();

        for(int i=0; i<arr.length; i++){
            char ch = arr[i];
            if(ch == '(' || ch =='{' || ch=='['){
                stack.push(ch);
            } 
            else if(ch == ')' || ch=='}' || ch == ']') {
                char bracket = stack.pop();
                if((ch == ')' && bracket != '(') ||
                (ch == '}' && bracket !='{') ||
                (ch == ']' && bracket !='[')){
                    return "not balanced";

                }
            }
        }

        if(stack.isEmpty()){
            return "balanced";
        } else  {
            return "Not balanced";
        }

    }
    
}
