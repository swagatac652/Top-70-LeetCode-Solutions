import java.util.*;
public class leet17 
{
    public List<String> letterCombinations(String digits)
    {
        LinkedList<String> list = new LinkedList<String>();
        if(digits.length()==0) 
        return list;
        list.add("");
        String char_map[] = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(int i=0;i<digits.length();i++)
        {
            int index = Character.getNumericValue(digits.charAt(i));
            while(list.peek().length()==i)
            {
                String permute = list.remove();
                for(char c : char_map[index].toCharArray())
                {
                    list.add(permute+c);
                }
            }
        }
        return list;
    }
}
