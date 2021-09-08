/*
     a  e  i  o u  = no. of possible words having length 1 and are lesicographically sorted
n=1  1  1  1  1 1  a e i o u
n=2  5  4  3  2 1  aa ae ai ao au (5) ee ei eo eu (4) ii io iu (3) oo ou (2) uu (1)
n=3  15 10 6  3 1  observe that it is a summation of previous two elements
n=4  35 20 10 4 1
*/
class leet1641 
{
    char[] ch = new char[]{'a','e','i','o','u'};
    public int countVowelStrings(int n) 
    {
        int ans=0;
        for(char c:ch) 
        {
            ans=ans+count(n-1,c);
        }
        return ans;
    }
    int count(int length, char last_char) 
    {
        if(length==0)
        {
            return 1;
        }
        int temp=0;
        for(char c:ch) 
        {
            if(last_char>=c)
            {
                temp = temp + count(length-1,c);
            }
        }
        return temp;
    }
}