import java.util.*;
class leet155_stack 
{
    static Stack<Integer> stack = new Stack<Integer>();
    static Stack<Integer> min_stack = new Stack<Integer>();
    leet155_stack() 
    {

    }

    public static void push(int value)
    {
        stack.push(value);
        if(min_stack.isEmpty())
        {
            min_stack.push(value);
            return;
        }
        int min = min_stack.peek();
        if(min>value)
        min_stack.push(value);
        else
        min_stack.push(min);
    }

    public static void pop()
    {
        stack.pop();
        min_stack.pop();
    }

    public static int top()
    {
       return stack.peek();
    }

    public static int getMin()
    {
        return min_stack.peek();
    }

    public static void main(String[] args)
    {
        
    }
}
