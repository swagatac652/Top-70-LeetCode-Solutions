import java.util.*;
public class leet229_majority2 
{
    public List<Integer> majorityElement(int[] nums)
    {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int num1 = -1, num2 = -1, c1 = 0, c2 = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == num1) {
                c1++;
            }
            else if(nums[i] == num2) {
                c2++;
            }
            else if(c1 == 0) {
                num1 = nums[i];
                c1 = 1;
            }
            else if(c2 == 0) {
                num2 = nums[i];
                c2 = 1;
            }
            else {
                c1--;
                c2--;
            }
        }
        
        
        int count1 = 0, count2 = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == num1) {            //To verify that the count of num1 is actually in majority or not!!
                count1++;
            }
            else if(nums[i] == num2) {       //To verify that the count of num2 is actually in majority or not!!
                count2++;
            }
        }
        
        if(count1 > n/3) {
            ans.add(num1);
        }
        if(count2 > n/3) {
            ans.add(num2);
        }
        
        return ans;
    }
}