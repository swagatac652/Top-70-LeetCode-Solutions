import java.util.*;
public class leet26_HashSet 
{
    public static int removeDuplicates(int[] nums)
    {
        HashSet<Integer> myset = new HashSet<>();

        for (int i = 0; i < nums.length; i++)
        myset.add(nums[i]);

        myset.toArray();

        return myset.size();
    }
    /*
    public int removeDuplicates(int[] nums) 
    {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) 
        {
            if (nums[j] != nums[i]) 
            {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    */
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

            int x = removeDuplicates(arr);

            System.out.println("Number of elements = "+x);
        }
        else
        System.out.println("Enter Value more than 0");
        br.close();
    }
}
