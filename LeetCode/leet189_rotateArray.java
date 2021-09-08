import java.util.*;
public class leet189_rotateArray 
{
    public static void rotate(int[] nums, int k)
    {
        int l=nums.length;
        k=k%l;
        for(int i=0;i<k;i++)
        {
            int t=nums[l-1];
            for(int j=0; j<l;j++)
            {
                int temp=nums[j];
                nums[j]=t;
                t=temp;
            }
        }
        for(int i=0;i<l;i++)
        System.out.print(nums[i]+" ");
    }
    public static void main(String[] args)
    {
        Scanner br = new Scanner(System.in);
        System.out.println("Enter array length");
        int n=br.nextInt();
        System.out.println("Enter rotation steps");
        int k=br.nextInt();
        int x=0;
        if(n>=1 && n<=100000 && k>=0 && k<=100000)
        {
            int arr[] = new int[n];
            System.out.println("Enter array element");
            for(int i=0;i<n;i++)
            {
                x=br.nextInt();
                if(x>=-Math.pow(2,31) && x<=Math.pow(2,31)-1)
                arr[i]=x;
                else
                {
                    System.out.println("Enter proper values");
                    i--;
                    continue;
                }
            }
            rotate(arr,k);
        }
        else
        System.out.println("Enter value between 1 and 100");
        br.close();
    }    
}
