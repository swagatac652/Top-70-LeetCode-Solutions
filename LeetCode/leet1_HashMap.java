import java.util.*;

public class leet1_HashMap 
{
    public static int[] twoSum(int[] nums, int target) 
    {
        int arr[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(target-nums[i]) && i!=map.get(target-nums[i]))
            {
                arr[0]=i;
                arr[1]=map.get(target-nums[i]);
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int nums[] = {2,7,11,12};
        int target=9;
        int arr[] = twoSum(nums,target);
        System.out.println(arr[0]+" "+arr[1]);
    }
}
