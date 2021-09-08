public class leet1079 
{
    public int numTilePossibilites(String tiles)
    {
        int[] freq = new int[26];
        for (char c:tiles.toCharArray())
        freq[c-'A']++;
        return helper(freq);
    }
    public int helper(int freq[])
    {
        int count=0;
        for(int i=0; i<26; i++)
        {
            if(freq[i]==0)
            continue;
            count++;
            freq[i]--;
            count=count+helper(freq);
            freq[i]++;
        }
        return count;
    }
}
