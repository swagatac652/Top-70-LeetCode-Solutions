import java.util.*;
public class leet131 
{
    public List<List<String>> partition(String s) 
    {
        List<List<String>> partitions = new ArrayList<List<String>>();
        backtrack(s,new ArrayList<String>(),partitions);
        return partitions;
    }
    private boolean isPalin(String s)
    {
        int l=0, r=s.length()-1;
        while(l<=r && s.charAt(l)==s.charAt(r))
        {
            l++;
            r--;
        }
        return l>=r;
    }
    private void backtrack(String s, List<String> current, List<List<String>> partitions)
    {
        if(s.isEmpty())
            partitions.add(current);
        
        for(int i=1; i<=s.length(); i++)
        {
            String left = s.substring(0,i);
            String right = s.substring(i);
            if(isPalin(left))
            {
                List<String> copy = new ArrayList(current);
                copy.add(left);
                backtrack(right,copy,partitions);
            }
        }
    }
}
