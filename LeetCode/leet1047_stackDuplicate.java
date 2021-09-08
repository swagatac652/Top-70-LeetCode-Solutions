import java.util.*;
public class leet1047_stackDuplicate 
{
    public static String removeDuplicates(String s)
    {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
            if(!stack.isEmpty() && stack.peek() == s.charAt(i))
            {
                stack.pop();
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
            for(Character ch : stack)
            {
                sb.append(ch);
            }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        System.out.println(removeDuplicates("abbaca"));
    }
}
