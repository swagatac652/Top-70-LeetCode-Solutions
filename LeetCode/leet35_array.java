public class leet35_array 
{
    public static int searchInsert(int[] nums, int target) 
    {
        int i=0;
        int index=-1;
        while(i<nums.length)
        {
            if(nums[i]==target)
            index=i;
            i++;
        }

        i=0;
        if(index==-1)
        {
            while(i<nums.length)
            {
                if(target>nums[i])
                {
                    index=i;
                    i++;
                }
                else
                {
                    index=i;
                    break;
                }
            }
        }

        return index;
    }
    public static void main(String[] args)
    {
        int nums[]={1,3,5,6};
        int target=7;
        int index = searchInsert(nums,target);
        System.out.println(index);
    }
}
