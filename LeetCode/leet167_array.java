import java.util.*;
public class leet167_array 
{
    public static int[] twoSum(int[] numbers, int target)
    {
        int low=0;
        int high=numbers.length -1;
        while(low<high)
        {
            int sum = numbers[low]+numbers[high];
            if(sum>target)
            high--;
            else if(sum<target)
            low++;
            else
            return new int[] {low+1, high+1};
        }
        return new int[] {low+1, high+1};
    }
    public static void main(String[] args)
    {
        Scanner br = new Scanner(System.in);
        System.out.println("Enter no of array elements");
        int n = br.nextInt();
        if(n>0)
        {
            int arr[] = new int[n];

            System.out.println("Enter array elements");

            for(int i=0; i<n; i++)
            arr[i] = br.nextInt();

            System.out.println("Enter target element");
            int target=br.nextInt();

            int x[] = twoSum(arr,target);

            System.out.println("Indexes are: ");
            System.out.println(x[0]+", "+x[1]);
        }
        else
        System.out.println("Enter Value more than 0");
        br.close();
    }
}
