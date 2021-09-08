
public class leet169_majority 
{
    public static int majorityElement(int[] nums)
    {
        int index=0,count=1;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[index]==nums[i])
                count++;
            else
                count--;
            if(count==0)
            {
                index=i;
                count=1;
            }
        }
        count=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[index]==nums[i])
                count++;
        }
        if(count<=nums.length/2)
           return -1;
        return nums[index];


    }
    public static void main(String[] args)
    {
        int nums[] = {8,8,6,6,6,4,6};
        int num = majorityElement(nums);
        System.out.println(num);
    }
}
