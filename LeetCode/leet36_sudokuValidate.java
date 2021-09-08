import java.util.*;
class leet36_sudokuValidated
{
    public boolean isValid(char board[][])
    {
        HashSet<String> found = new HashSet<String>();
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                char current = board[i][j];
                if(current!='.')
                {
                    if((!found.add(current+" found in row "+i)) || (!found.add(current+" found in column "+j)) || (!found.add(current+" found in sub-box "+i/3+"-"+j/3)))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}