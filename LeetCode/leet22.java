import java.util.*;
public class leet22 
{
    public List<String> generateParenthesis(int n) 
    {
        List<String> parenthesis = new ArrayList<String>();
        backtrack(parenthesis,"",0,0,n);
        return parenthesis;
    }
    public void backtrack(List<String> parenthesis,String current,int open,int close,int max)
    {
        if(current.length()==max*2)
        {
            parenthesis.add(current);
            return;
        }

        if(open<max) 
        backtrack(parenthesis,current+"(",open+1,close,max+1);

        if(close<open)
        backtrack(parenthesis,current+")",open,close+1,max);
    }
}
/*
current=""
parenthesis=""
n=2
max=2
open=0
close=0

if(open<max)
    current="("
    max=2
    open=1
    close=0

    if(open<max)
        current="((" --> this will ultimately result in (())
        max=2
        open=2
        close=0

        if(open<max) --> false
if(close<open) -->0<1
    current="()"
    max=2
    open=1
    close=1
    if(open<max)
        current="()("
        max=2
        open=2
        close=1
        
        if(open<max) -->false

        if(close<open) -->1<2
            current="()()"
            max=2
            open=2
            close=2

if(close<open) -->2<2 false

return "()()"

*/