import java.util.*;
public class leet191_hammingWeight
{
    public static int hammingWeight(int n)
    {
        int count=0;
        for(int i=0; i<=31; i++)
        {
            if(((n>>i)&1)==1)
            count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner br = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=br.nextInt();
        int count = hammingWeight(n);
        System.out.println(count);
        br.close();
    }
}