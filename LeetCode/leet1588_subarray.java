import java.util.*;
public class leet1588_subarray
{
    public static int sumOddLengthSubarrays(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i; j<arr.length; j+=2)
            {
                for(int k=i; k<=j;k++)
                {
                    sum=sum+arr[k];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner br = new Scanner(System.in);
        System.out.println("Enter array length");
        int n=br.nextInt();
        int x=0;
        if(n>=1 && n<=100)
        {
            int arr[] = new int[n];
            System.out.println("Enter array element");
            for(int i=0;i<n;i++)
            {
                x=br.nextInt();
                if(x>=1 && x<=1000)
                arr[i]=x;
                else
                {
                    System.out.println("Enter values betwwen 1 and 1000");
                    i--;
                    continue;
                }
            }
            int sum=sumOddLengthSubarrays(arr);
            System.out.println(sum);
        }
        else
        System.out.println("Enter value between 1 and 100");
        br.close();
    }
}
