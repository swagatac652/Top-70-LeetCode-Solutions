public class leet1800_circularSubarray 
{
    public static int max(int a,int b)
    {
        if(a>b)
        return a;
        else
        return b;
    }

    public int maxAscendingSum(int[] nums) /* O(n^2) */
    {
        int sum=nums[0];
        for(int i=0; i<nums.length; i++)
        {
            int curr_max=nums[i];
            int curr_sum=nums[i];
            for(int j=1; j<nums.length; j++)
            {
                int index = (i+j)%nums.length;
                curr_sum += nums[index];
                curr_max += max(curr_max,curr_sum);
            }
            sum=max(sum,curr_max);
        }
        return sum;
    }

    
}
