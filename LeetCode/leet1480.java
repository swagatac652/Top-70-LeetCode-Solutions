import java.io.*;
public class leet1480 
{
    public static int[] runningSum(int[] nums)throws IOException
    {
        int arr[] = new int[nums.length];
        int sum=0, x=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[x];
            arr[i]=sum;
            x++;
        }
        return arr;
    }
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of Elements: ");
        int n = Integer.parseInt(br.readLine());
        int x=0;
        if(n>=1 && n<=1000)
        {
            System.out.println("Enter Array Elements: ");
            int a[] = new int[n];
            for(int i=0; i<n; i++)
            {
                x=Integer.parseInt(br.readLine());
                if(x>= -1000000 && x<=1000000)
                a[i]=x;
                else
                {
                    System.out.println("Enter value between -1000000 and 1000000");
                    i--;
                    continue;
                }
            }
            int arr[]=runningSum(a);
            System.out.println("The Running Sum is");
            for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        }
        else
        System.out.println("Enter a value between 1 and 1000");    
    }
}
