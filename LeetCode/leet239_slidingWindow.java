import java.util.ArrayList;

public class leet239_slidingWindow 
{
    public static int[] maxSlidingWindow(int[] nums, int k) 
    {
       /* ArrayList<Integer> arr = new ArrayList<Integer>();
        
        if(k==1)
        {
            for(int i=0;i<nums.length;i++)
            arr.add(nums[i]);

            int array[] = new int[arr.size()];
            for(int i=0;i<arr.size();i++)
                array[i]=arr.get(i);

            return array;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
        {
            max=maximum(max,nums[i]);
        }
        arr.add(max);
        int index=0;
        index=maxIndex(nums,max);
        for(int i=k; i<nums.length; i++)
        {
            if(index==i-k)
            max=0;

            max=maximum(max,nums[i]);
            arr.add(max);
        }

        int array[] = new int[arr.size()];
            for(int i=0;i<arr.size();i++)
                array[i]=arr.get(i);
        return array; */

        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> window = new ArrayList<Integer>();
        for(int i=0;i<k;i++)
        {
           window.add(nums[i]);
        }
        arr.add(maximum(window));
        for(int i=k;i<nums.length;i++)
        {
           window.remove(0);
           window.add(nums[i]);
           arr.add(maximum(window));
        }
        int array[] = new int[arr.size()];
            for(int i=0;i<arr.size();i++)
                array[i]=arr.get(i);
        return array;
    }
    public static int maximum(ArrayList<Integer> arr)
    {
        int max=Integer.MIN_VALUE;
        /*System.out.println("Window elements are");*/
        for(int i=0;i<arr.size();i++)
        {
            /*System.out.println(arr.get(i));*/
            if(max<arr.get(i))
                max=arr.get(i);
        }
        return max;
    }
    /*public static int maxIndex(int arr[], int num)
    {
        int index=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==num)
                index = i;
        }
        return index;
    }*/
    public static void main(String[] args)
    {
        /* int nums1[] = {1,3,1,2,0,5};
        int nums2[] = {1,3,-1,-3,5,3,6,7};
        int nums3[] = {1};
        int nums4[] = {1,-1};
        int nums5[] = {7,2,4}; */
        int nums6[] = {9,11}; 
        int window = 2;
        int arr[] = maxSlidingWindow(nums6,window);
        System.out.println("Maximum windows are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
