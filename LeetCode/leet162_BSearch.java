public class leet162_BSearch 
{
    public int findPeakElement(int[] nums) 
    {
        int len = nums.length;
        int l=0, r=len-1;
        
        while(true)
        {
            int m = (l+r)/2;
            if(m+1<len && nums[m+1]>nums[m])
                l = m+1; 
            else if(m-1>=0 && nums[m-1]>nums[m])
                r = m-1; 
            else
                return m;
        }
    }
}
