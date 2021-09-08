import java.util.*;
public class leet1672_matrix 
{
    static int m,n;
    public static int maximumWealth(int[][] accounts)
    {
        int max=0;
        int sum=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum=sum+accounts[i][j];
            }
            if(sum>max)
            max=sum;
            sum=0;
        }
        return max;
    }  
    public static void main(String[] args)
    {
        Scanner br = new Scanner(System.in);
        System.out.println("Enter the matrix dimensions: ");
        m=br.nextInt();
        n=br.nextInt();
        int x=0;
        if(m>=1 && m<=50 && n>=1 && n<=50)
        {
            int arr[][] = new int[m][n];
            System.out.println("Enter matrix elements");
            for(int i=0;i<m;i++)
            {
                for(int j=0; j<n; j++)
                {
                    x=br.nextInt();
                    if(x>=1 && x<=100)
                    arr[i][j]=x;
                    else
                    {
                        System.out.println("Enter value between 1 and 100");
                        j--;
                        continue;
                    }
                }
            }
            int sum=maximumWealth(arr);
            System.out.println(sum);
        }
        else
        System.out.println("Enter values between 1 and 50");
        br.close();
    }
}
