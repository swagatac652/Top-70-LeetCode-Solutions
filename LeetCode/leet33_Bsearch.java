class leet33_Bsearch
{
    public static int search(int[] nums, int target)
    {
        if(nums.length ==0)
        return -1;
        int low=0, high=nums.length-1;
        while(low<high)
        {
            int mid = (int)(low+high)/2;
            if(nums[mid]>nums[high])
            low=mid+1;
            else
            high=mid;
        }

        int pivot=low;

        low=0;
        high=nums.length-1;

        if(target==nums[pivot])
        return pivot;
        else if(target>nums[pivot] && target<=nums[high])
        low=pivot;
        else 
        high=pivot;

        while(low<=high)
        {
            int mid=(int)(low+high)/2;
            if(nums[mid]==target)
            return mid;
            else if(target>nums[mid])
            low=mid+1;
            else 
            high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] ={4,5,6,7,0,1,2};
        int target=0;
        int index=search(arr,target);
        System.out.println("Index = "+index);
    }
}