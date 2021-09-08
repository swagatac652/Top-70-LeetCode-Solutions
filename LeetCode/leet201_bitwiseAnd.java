import java.util.*;
public class leet201_bitwiseAnd 
{
    public static int rangeBitwiseAnd(int left, int right)
    {
        int res=right;
        int i=right;
        while(i>left)
        {
            res=res&(i-1);
            i=res;
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int arr1=sc.nextInt();
        int arr2=sc.nextInt();
        int res=rangeBitwiseAnd(arr1,arr2);
        System.out.println("Bitwise AND of range = "+res);
        sc.close();
    }
}
