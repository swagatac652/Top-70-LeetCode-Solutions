import java.util.*;
public class leet217_duplicates 
{
    public static boolean containsDuplicate(int[] nums)
    {
        HashSet<Integer> myset = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++)
        {
            if(myset.contains(nums[i]))
            return true;
            else
            myset.add(nums[i]);
        }
        return false;
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

            boolean x = containsDuplicate(arr);

            if(x)
            System.out.println("Contains Duplicates");
            else
            System.out.println("Contains NO Duplicates");
        }
        else
        System.out.println("Enter Value more than 0");
        br.close();
    }
}
