import java.util.*;
public class leet1_array 
{
    public static int[] twoSum(int[] nums, int target)
    {
        int temp[] = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            for(int j=i+1; j < nums.length; j++)
            {
                if(target == nums[i]+nums[j])
                {
                    temp[0]=i;
                    temp[1]=j;
                    break;
                }
            }
        }
        return temp;
    }
    public static void main(String[] args)
    {
        Scanner br = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = br.nextInt();
        System.out.println("Enter target");
        int target = br.nextInt();
        if(n>=2 && target>0)
        {
            int arr[] = new int[n];
            System.out.println("Enter array elements"); 
            for(int i=0;i<n;i++)
            arr[i]=br.nextInt();

            int temp[] = twoSum(arr,target);

            System.out.println("New array is");
            for(int i=0;i<2;i++)
            System.out.print(temp[i]+" ");
        }
        else
        {
            System.out.println("Enter values more than equal to 2");
        }
        br.close();
    }
}
